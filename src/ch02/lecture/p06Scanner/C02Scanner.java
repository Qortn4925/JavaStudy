package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 > ");
        String s = scanner.nextLine();
        System.out.print("나이 >");
        String age = scanner.nextLine();
        String desc = STR."\{s}님의 나이는 \{age}입니다.";
        
        System.out.println("desc = " + desc);

    }
}
