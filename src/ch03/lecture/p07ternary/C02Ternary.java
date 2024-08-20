package ch03.lecture.p07ternary;

import java.util.Scanner;

public class C02Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이 >.");
        int age = sc.nextInt();


        String message = (age >= 13 && age <= 19) ? "청소년" : "으른 오얼 으른이";
        System.out.println(message + "이다.");

    }

}
