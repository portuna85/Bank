package ch12.sec06.wait_notify;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Databox databox = new Databox();

        ProducerThread producerThread = new ProducerThread(databox);
        ConsumerThread consumerThread = new ConsumerThread(databox);

        producerThread.start();
        consumerThread.start();
    }
}
