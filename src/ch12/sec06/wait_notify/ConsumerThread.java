package ch12.sec06.wait_notify;

public class ConsumerThread extends Thread {
    private Databox databox;

    public ConsumerThread(Databox databox) {
        this.databox = databox;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String data = databox.getData();
        }
    }


}
