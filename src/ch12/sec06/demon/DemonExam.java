package ch12.sec06.demon;

public class DemonExam {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {}
        System.out.println("스레드 종료");
    }
}
