package ch04.lecture.p01if;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입려갷주세용>");
        int age = sc.nextInt();

        if (age >= 20) {
            System.out.println("성인");
        } else if (age >= 13) {
            System.out.println("청");
        } else if (age >= 6) {
            System.out.println("어린이");
        } else if (age >= 1) {
            System.out.println("응아 에요~");
        } else {
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }
}
