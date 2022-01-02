package ch12.sec06.wait_notify;

public class ProducerThread extends Thread {
    private Databox databox;

    public ProducerThread(Databox databox) {

        this.databox = databox;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            String data = "Data- "+i;
            databox.setData(data);
        }


    }


}
