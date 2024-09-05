package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class C08Or {
    public static void main(String[] args) {

        //  | : or

        // 괄호안에 있는 a., or, 가 가 한개 1이상
        String p1 = "(a|가)+";
        System.out.println(Pattern.matches(p1, "a"));
        System.out.println(Pattern.matches(p1, "가"));
        System.out.println(Pattern.matches(p1, "가aa"));

        String p2 = "(ab|가나)+";
        System.out.println(Pattern.matches(p2, "abab"));
        System.out.println(Pattern.matches(p2, "ab가나"));
        System.out.println(Pattern.matches(p2, "가나ab"));


    }
}
