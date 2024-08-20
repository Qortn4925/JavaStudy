package ch03.lecture.p04logical;

import java.util.Scanner;

public class C02And {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        boolean teenage = age >= 13 && age <= 19;
        if (teenage) {
            System.out.println("청소년");

        } else {
            System.out.println("청소년x");
        }
    }
}
