package ch15.lecture.p04set;

import java.util.HashSet;

public class C03Set {
    public static void main(String[] args) {

        var set = new HashSet<String>();
        set.add("java");
        set.add("vue");
        set.add("css");
        set.add("git");
        set.add("vue");


        System.out.println(set);
        System.out.println(set.size());


        boolean b3 = set.add(null);
        boolean b4 = set.add(null);

        System.out.println(set);
        System.out.println(set.size());
    }
}
