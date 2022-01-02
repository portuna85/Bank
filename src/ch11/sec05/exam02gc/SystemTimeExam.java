package ch11.sec05.exam02gc;

public class SystemTimeExam {
    public static void main(String[] args) {
        long nanoTime = System.nanoTime();

        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            sum += i;

        }
        long na = System.nanoTime();

        System.out.println("1~10000까지의 합 : " + sum);
        System.out.println("계산에 " + (na - nanoTime) + " 나노초가 소요되었습니다.");
    }
}
