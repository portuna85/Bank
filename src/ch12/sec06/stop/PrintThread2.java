package ch12.sec06.stop;

public class PrintThread2 extends Thread {

    @Override
    public void run() {
            while (true) {
                System.out.println("실행중");
                if(Thread.interrupted()) {
                    break;
                }
            }


        System.out.println("자원 정리");
        System.out.println("종료");
    }
}
