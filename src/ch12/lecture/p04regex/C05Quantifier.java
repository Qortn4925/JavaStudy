package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class C05Quantifier {
    public static void main(String[] args) {

        //{n} : n개
        //0~9 3개
        String p1 = "[0-9]{3}";
        System.out.println(Pattern.matches(p1, "222"));
        System.out.println(Pattern.matches(p1, "22a"));


        //전화번호부 ?
        String p2 = "\\d{3}-\\d{4}-\\d{4}";

        System.out.println(Pattern.matches(p2, "010-1111-2222"));
        System.out.println(Pattern.matches(p2, "010-1111-222"));

        // {n,m} : n~m개
        String p3 = "\\p{IsHangul}{3,4}";
        System.out.println(Pattern.matches(p3, "손흥민"));
        System.out.println(Pattern.matches(p3, "제갈공명"));
        System.out.println(Pattern.matches(p3, "제갈공명이"));
        System.out.println(Pattern.matches(p3, "제갈"));

        //{n,} : n개 이상

        // ? : {0,1} 있거나 없거나
        // * : {0,} 0개 이상
        // + : {1,} 1개 이상
    }
}
