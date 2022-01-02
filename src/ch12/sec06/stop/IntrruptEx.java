package ch12.sec06.stop;

public class IntrruptEx {
    public static void main(String[] args) {
        PrintThread2 printThread2 = new PrintThread2();
        Thread thread = new Thread();
        printThread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}