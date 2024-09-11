package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messages = new LinkedList<>();

        messages.offer(new Message("sendMail", "홍길동"));
        messages.offer(new Message("send에센에스", "신용권"));
        messages.offer(new Message("send카톡", "감자바"));

        while (!messages.isEmpty()) {
            Message message = messages.poll();
            switch (message.command) {
                case "sendMail" -> {
                    System.out.println(message.to + "메일");
                }
                case "send에센에스" -> {
                    System.out.println(message.to + "sns");
                }
                case "send카톡" -> {
                    System.out.println(message.to + "카톡");
                }
            }
        }
    }
}
