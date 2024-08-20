package ch03.lecture.p04logical;

import java.util.Scanner;

public class C03Or {
    public static void main(String[] args) {
        //2의 배수 또는 5의 배수인지  확인
        Scanner sc = new Scanner(System.in);
        System.out.println("수 입력하세용 >>");

        int num = sc.nextInt();

        boolean result = (num % 2 == 0) || (num % 5 == 0);
        if (result) {
            System.out.println("2또는 5의 배수");

        } else {
            System.out.println("2,5의 배수 xx");
        }
    }
}
