package ch12.sec06.thread_join;

public class JoinExam {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {}

        System.out.println("1 ~ 100의 총 합 : " + sumThread.getSum());
    }


}
