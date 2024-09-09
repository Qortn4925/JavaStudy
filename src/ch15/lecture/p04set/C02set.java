package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("vue");
        set.add("react");
        set.add("jsp");

        //전체 탐색
        //1.향상된 for
        System.out.println("향상된 포문");
        for (String item : set) {
            System.out.println("item = " + item);
        }
        //2. for each 메소드
        set.forEach(System.out::println);

        //3.iterator 사용
        System.out.println("iterator------");
        Iterator<String> iterator = set.iterator();
        //hasnext,  next 두개
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }

    }
}
