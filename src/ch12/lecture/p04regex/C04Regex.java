package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class C04Regex {
    public static void main(String[] args) {

        // \\ : \
        String p1 = "\\\\";
        System.out.println(matches(p1, "\\"));

        //. : 모든 문자
        String p2 = ".";
        System.out.println(matches(p2, "a"));
        System.out.println(matches(p2, "1"));
        System.out.println(matches(p2, "A"));
        System.out.println(matches(p2, "가"));

        String p3 = "..";
        System.out.println(matches(p3, "1가"));
        System.out.println(matches(p3, "ab"));
        System.out.println(matches(p3, "0a"));

        //  \. : .
        String p4 = "\\.";
        System.out.println(matches(p4, "."));


    }
}
