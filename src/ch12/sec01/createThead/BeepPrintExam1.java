package ch12.sec01.createThead;

import java.awt.*;

public class BeepPrintExam1 {
    public static void main(String[] args) {
        // 비프음을 5번 반복해서 소리나게 하는 작업
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

        // "띵" 문자열 5번 출력하는 작업
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
}
