package ch12.lecture.p04regex;

import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class C01RegularExpression {
    public static void main(String[] args) {
        //regular expression (정규 표현식)
        // 문자열의 패턴을 나타는 코드
        // 문자열의 형식이 이메일 ,전화번호 처럼 정해져있는 경우가 있다 > 이런걸 검증하기 위해서 작성하는 표현

        //관련 클래스 : java.util.regex.Pattern
        // matches: 패턴과 일치하는 지 확인하는 메소드
        //문자 하나
        String p1 = "a";

        String s1 = "a";

        System.out.println(matches(p1, s1));

        System.out.println(matches(p1, "aa"));
        System.out.println(matches("aa", "aa"));
        System.out.println(matches("aa", "bb"));

        //문자 묶음  a 또는 b 또는 c
        String p2 = "[abc]";
        System.out.println(matches(p2, "a"));
        System.out.println(matches(p2, "b"));
        System.out.println(matches(p2, "c"));
        System.out.println(matches(p2, "abc"));
        String p3 = "[abc][abc][abc]";
        System.out.println(matches(p3, "abc"));  // true
        System.out.println(matches(p3, "bbb"));  // true
        System.out.println(matches(p3, "bca"));  // true
        System.out.println(matches(p3, "a"));  // false

        //a~z 까지 한 글자 , a-z 한 글자
        String p4 = "[a-z][a-z]";
        System.out.println(matches(p4, "ad"));
        System.out.println(matches(p4, "se"));

        String p6 = "[a-z][0-9][0-9]";
        System.out.println(matches(p6, "a01"));
        System.out.println(matches(p6, "z33"));


        //첫 글자 알파벳 소문자거나 , 0~9사이 숫자
        String p7 = "[a-z0-9][0-9][0-9]";
        System.out.println(matches(p7, "007"));
        System.out.println(matches(p7, "a22"));
        System.out.println(matches(p7, "zz1"));

        //문자 제외
        String p8 = "[^a-c][0-9]"; // > a~c 빼고
        System.out.println(matches(p8, "d7"));
        System.out.println(matches(p8, "a1"));
    }
}
