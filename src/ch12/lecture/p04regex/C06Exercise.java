package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class C06Exercise {
    public static void main(String[] args) {
        // 사용자 입력을 받아서
        // 전화번호 패턴과 같은 지 확인
        // 010-9999-111
        // 02-2345-6789
        // 첫  2~3 ,  두  3~4  맨 마지막 4

        Scanner sc = new Scanner(System.in);

        String p1 = "\\d{2,3}-\\d{3,4}-\\d{4}";

        while (true) {
            System.out.println("전화번호 입력");
            String input = sc.nextLine();

            if (Pattern.matches(p1, input)) {
                System.out.println("올바른 입력");
            } else {
                System.out.println("숫자를 제대로 입력하세용");

            }

            if (input.equals("Q"))
                break;

        }
    }
}
