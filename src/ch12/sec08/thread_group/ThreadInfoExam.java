package ch12.sec08.thread_group;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExam {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSave");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();

        Set<Thread> threads = map.keySet();

        for (Thread thread : threads) {
            System.out.println(thread.getName()  + ((thread.isDaemon())?"데몬": "(주)"));
        }
    }
}