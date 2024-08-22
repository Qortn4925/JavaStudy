package ch04.sec04;

import java.util.Scanner;

public class DoWhileExampl {
    public static void main(String[] args) {
        System.out.println("메시지를 입력");
        System.out.println("프로그램 종료 >> q");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.println(">");
            inputString = sc.nextLine();
            System.out.println(inputString);

        } while (!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
