package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class C07Group {
    public static void main(String[] args) {
        // (): 그룹

        String p1 = "x+"; // + {1,};
        System.out.println(Pattern.matches(p1, "x"));
        System.out.println(Pattern.matches(p1, "xx"));
        System.out.println(Pattern.matches(p1, "xxx"));
        //() 안에 작성한것이 1개이상

        String p2 = "(abc)+";
        System.out.println(Pattern.matches(p2, "abc"));
        System.out.println(Pattern.matches(p2, "abcabc"));
        System.out.println(Pattern.matches(p2, "abcabb")); //false abc, abc

        String p3 = "(011)*";  // * {0,}

        System.out.println(Pattern.matches(p3, ""));
        System.out.println(Pattern.matches(p3, "011"));
        System.out.println(Pattern.matches(p3, "011011"));


    }
}
