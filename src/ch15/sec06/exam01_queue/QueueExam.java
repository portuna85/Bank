package ch15.sec06.exam01_queue;

import java.util.LinkedList;

import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "고길동"));
        messageQueue.offer(new Message("sendKAKAO", "리차드"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendSMS":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendMail":
                    System.out.println(message.to + "님에게 문자를 보냅니다.");
                    break;
                case "sendKAKAO":
                    System.out.println(message.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}