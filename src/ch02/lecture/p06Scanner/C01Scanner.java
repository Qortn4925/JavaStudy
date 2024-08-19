package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {
        // Scanner :  소스를 훑으며 입력 받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 >>>");
        String str = scanner.nextLine();
        System.out.println("출력  >> = " + str);

    }
}
