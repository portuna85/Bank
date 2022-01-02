package ch11.sec03.exam04_finalize;

public class FinalizeExam {
    public static void main(String[] args) {
        Counter cnt = null;
        for (int i = 0; i <= 50; i++) {
            cnt = new Counter(i);

            cnt = null;
            System.gc();
        }
    }
}