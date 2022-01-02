package ch12.sec01.createThead;

import java.awt.*;

public class BeepTask implements Runnable {
    public void run() {
        // 비프음을 5번 반복해서 소리나게 하는 작업
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}