package ch12.sec06.stop;

public class StopFlagEx {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        printThread1.setStop(true);
    }
}
