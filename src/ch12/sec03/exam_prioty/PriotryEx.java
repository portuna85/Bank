package ch12.sec03.exam_prioty;

public class PriotryEx {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Thread calcThread = new CalcThread("Thread " + i);
            if(i != 10) {
                calcThread.setPriority(Thread.MAX_PRIORITY);
            } else {
                calcThread.setPriority(Thread.MIN_PRIORITY);
            }
            calcThread.start();
        }
    }
}