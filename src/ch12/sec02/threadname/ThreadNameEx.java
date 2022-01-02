package ch12.sec02.threadname;

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("시작 스레드 이름 : "+thread.getName());

        System.out.println();
        Thread threadA = new ThreadA();
        System.out.println("쓰레드A를 생성한 스레드 : "+Thread.currentThread().getName());
        threadA.start();

        System.out.println();
        Thread threadB = new ThreadB();
        System.out.println("쓰레드B를 생성한 스레드 : "+Thread.currentThread().getName());
        threadB.start();
    }
}
