package ch04.sec02;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 >>:");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 a입니다");
        } else {
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B입니다");
        }
    }
}
