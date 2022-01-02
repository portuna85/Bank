package ch12.sec01.createThead;

import java.awt.*;

public class BeepPrintExam3 {
    public static void main(String[] args) {
        // how1
        /*Thread thread = new BeepThread();
        thread.start();*/

        Thread thread = new Thread() {
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
        };
        thread.start();

        // "띵" 문자열 5번 출력하는 작업
        for (int i = 0; i < 5; i++) {
            System.out.println("띵동~~");
        }
        try {
            Thread.sleep(670);
        } catch (InterruptedException e) {
        }
    }
}