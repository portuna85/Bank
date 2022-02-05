package Cal.haseok;

public class LottoExam {
    public static void main(String[] args) {
        int LottoNumber[] = new int[6];
        Lotto lotto = new Lotto();

        // for문 돌려서 1 ~ 45번의 랜덤숫자 추출
        for (int i = 0; i < LottoNumber.length; i++) {
            LottoNumber[i] = lotto.getNum();
            System.out.print(" " + LottoNumber[i]);

            // 중복처리로직
            // 앞의 숫자와 뒤의 숫자가 같으면 중복된 숫자를 알려주고 다시 한 번돈다.
            for (int j = 0; j < i; j++) {
                if (LottoNumber[i] == LottoNumber[j]) {
                    //System.out.println("중복된 숫자가 있어요 --> " + LottoNumber[i]);
                    // 중복건수를 처리하기의해 반복분 i 번째를 다시 내린다.
                    i--;
                }

                //오름차순 처리로직
                //해당 알고리즘은 정말많이 쓰인다. 현재는 작은 수부터 크게 나오게 코딩했지만
                //부등호를 반대로해주면 큰 수부터 차례대로 내열한다.
                if (LottoNumber[i] < LottoNumber[j]) {
                    int LottoNumberTemp = LottoNumber[i];
                    LottoNumber[i] = LottoNumber[j];
                    LottoNumber[j] = LottoNumberTemp;
                }
            }
        }

        System.out.println();
        // 위에서 정리된 LottoNumber 배열을 다시 마지막으로 정리
        for (int i = 0; i < LottoNumber.length; i++) {
            System.out.println("LOTTO NUMBER  ------->               " + LottoNumber[i]);
        }
    }
}