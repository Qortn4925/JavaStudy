package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C03List {
    public static void main(String[] args) {
        //list: 순서가 있다.
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");

        System.out.println(list);
        list.add("css");
        list.add("html");
        System.out.println("list = " + list);

        //null 추가 가능
        list.add(null);
        list.add(null);

        System.out.println(list);
        //remove 먼저 발견한거 선입 선출
        list.remove("css");
        System.out.println("list = " + list);
        list.remove(null);
        System.out.println("list = " + list);

    }
}
