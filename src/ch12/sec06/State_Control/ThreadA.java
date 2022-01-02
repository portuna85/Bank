package ch12.sec06.State_Control;

public class ThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;
    
    public void run() {
        while(!stop) {
            if(work) {
                System.out.println("스레드A 작업내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("스레드A 종료");
    }
}
