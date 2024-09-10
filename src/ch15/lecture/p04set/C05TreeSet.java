package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(111);
        set1.add(123);
        set1.add(133);
        set1.add(133);


        System.out.println("set1 = " + set1);
        //넣은 순서와 상관 없이 요소들의 값에 의해 정렬된다.
        Set<Integer> set2 = new TreeSet<>();
        set2.add(123);
        set2.add(111);

        set2.add(133);
        set2.add(133);
        System.out.println();
        System.out.println("set2 = " + set2);

        TreeSet<String> set3 = new TreeSet<>();
        set3.add("java");
        set3.add("abc");
        set3.add("react");
        set3.add("sql");
        System.out.println("set3 = " + set3);
        System.out.println(set3.getFirst());
        System.out.println(set3.getLast());
    }
}
