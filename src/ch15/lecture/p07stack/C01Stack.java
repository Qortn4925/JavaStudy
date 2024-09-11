package ch15.lecture.p07stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // 원소 추가하기
        //push
        stack.push("java");
        stack.push("css");
        stack.push("react");
        stack.push("vue");
        stack.push("sql");


        //원소 빼기
        //pop
        String item1 = stack.pop();
        System.out.println("item1 = " + item1);

        String itme2 = stack.pop();
        System.out.println("itme2 = " + itme2);
        //확인하기
        int size = stack.size();
        System.out.println("size = " + size);

        String item3 = stack.peek();
        System.out.println("item3 = " + item3);
    }
}
