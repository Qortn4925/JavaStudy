package ch15.lecture.p02collections;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C01Collections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("spring");
        list.add("react");
        list.add("html");

        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println(list);

        //순서 뒤집기
        Collections.reverse(list);
        System.out.println("list = " + list);

        String max = Collections.max(list);
        System.out.println("max = " + max);

        String min = Collections.min(list);
        System.out.println("min = " + min);
    }
}
