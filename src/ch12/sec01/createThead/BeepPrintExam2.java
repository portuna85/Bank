package ch12.sec01.createThead;

import java.awt.*;

public class BeepPrintExam2 {
    public static void main(String[] args) {
        /*
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();
        */

        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        */

        Thread thread = new Thread(() -> {Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }});
        thread.start();

        // "띵" 문자열 5번 출력하는 작업
        for (int i = 0; i < 5; i++) {
            System.out.println("띵동ddd");
        }
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
        }
    }
}