package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수1 입력 >");
        String a = sc.nextLine();


        System.out.print("수2 입력 >");
        String b = sc.nextLine();

//        double a1 = Double.parseDouble(a);
//        double a2 = Double.parseDouble(b);
//
//        System.out.println("두 실수의 합은" + (a1 + a2));
        C04Scanner c04 = new C04Scanner();
        System.out.print("합은" + c04.doubleHap(a, b));
    }

    public double doubleHap(String a, String b) {
        double res = Double.parseDouble(a);
        double res2 = Double.parseDouble(b);

        return res + res2;
    }
}
