package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class C03RegEx {
    public static void main(String[] args) {
        // 이미 정의된 클래스

        //[0-9] : \d
        //[a-zA-Z_0-9] :\w
        // 공백문자 : \s

        // 문자열로 \ 표현할라면   \\ >> \ 로  그래서 \d >> \\d
        String p1 = "\\d\\d\\d";
        System.out.println(Pattern.matches(p1, "123"));
        System.out.println(Pattern.matches(p1, "22"));
        System.out.println(Pattern.matches(p1, "6789"));
        System.out.println(Pattern.matches(p1, "678"));

        String p2 = "\\d\\s\\d";
        System.out.println(Pattern.matches(p2, "9 1"));
        System.out.println(Pattern.matches(p2, "911"));

        String p3 = "\\w\\w\\w";
        System.out.println(Pattern.matches(p3, "_ab"));
        System.out.println(Pattern.matches(p3, "abc"));
        System.out.println(Pattern.matches(p3, "___"));
        System.out.println(Pattern.matches(p3, "_1a"));

        // 한글  >> \p{IsHangul}
        String p4 = "[가-힣][가-힣]";
        System.out.println(Pattern.matches(p4, "흥민"));
        System.out.println(Pattern.matches(p4, "홀란드"));
        System.out.println(Pattern.matches(p4, "강인"));
    }
}
