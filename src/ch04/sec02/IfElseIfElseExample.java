package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력>>");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("90~100");
            System.out.println("등급은 A");
        } else if (score >= 80) {
            System.out.println("점수가 80~89");
            System.out.println("등급은 b");
        } else if (score >= 70) {
            System.out.println("점수가 70~79");
            System.out.println("등급츤 c");
        } else {
            System.out.println("점수가 70아래");
        }
    }
}
