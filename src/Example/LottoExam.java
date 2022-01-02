package Example;

import java.util.Arrays;

public class LottoExam {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.random() * 45 + 1);

            boolean a = true;

            for (int k : lotto) {
                if (k == num) {
                    i--;
                    a = false;
                    System.out.print(num + " : 중복");
                    break;
                }
            }


            if(a) {
                lotto[i] = num;

                System.out.print(lotto[i] + " ");
            }
        }
    }
}