package ch15.lecture.p08queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // 중복 가능
        //추가 :offer
        queue.offer("java");
        queue.offer("css");
        queue.offer("html");
        queue.offer("css");

        //꺼내기 : poll
        String item1 = queue.poll();
        String item2 = queue.poll();
        System.out.println("item1 = " + item1);
        System.out.println("item2 = " + item2);
        //확인하기
        //peek: 끝에 있는 원소 확인
        String item3 = queue.peek();
        System.out.println("item3 = " + item3);

        //isEmpty, size

        System.out.println(queue.size());
    }
}
