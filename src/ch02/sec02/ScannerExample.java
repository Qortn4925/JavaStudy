package ch02.sec02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x값 입력");
        String stx = sc.nextLine();
        int x = Integer.parseInt(stx);

        System.out.println("y 입력");
        String sty = sc.nextLine();
        int y = Integer.parseInt(sty);

        int result = x + y;
        System.out.println("result = " + result);
        System.out.println();

        while (true) {
            System.out.println("입력 문자열");
            String data = sc.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("data = " + data);
        }

        System.out.println("종료");
    }
}
