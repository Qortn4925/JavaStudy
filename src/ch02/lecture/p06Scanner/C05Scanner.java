package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        // nextline : 엔터를 만날 때 까지의 입력값
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 >");
        String line1 = sc.nextLine();
        System.out.println("line1 = " + line1);

        // next :  빈 칸을 만날 때 까지 스캔 뒤에 입력은 씹힘
        System.out.print("입력 2>");
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(" a = " + a + " b = " + b + " c = " + c);


    }
}
