package ch14.sec05.exam01_runnable;

public class RunnableExam {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }
}