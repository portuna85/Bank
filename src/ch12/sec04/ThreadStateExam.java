package ch12.sec04;

import ch12.sec05.exam01_state.StatePrintThread;
import ch12.sec05.exam01_state.TargetThread;

public class ThreadStateExam {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());

        statePrintThread.start();
    }
}
