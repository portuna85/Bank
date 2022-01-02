package ch12.sec06.thread_join;

public class WorkObject {

    public synchronized void methodA() {
        System.out.println("ThreadA 의 WorkObject.methodA 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        System.out.println("ThreadB 의 WorkObject.methodB 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}
