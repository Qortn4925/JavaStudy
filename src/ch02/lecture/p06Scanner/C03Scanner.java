package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  입력받을 값은 스트링으로 밖에 안된다 >> pasing을 통한 형변환 해야함
        System.out.print(" 수1>");
        String num1 = sc.nextLine();

        System.out.print(" 수2>");
        String num2 = sc.nextLine();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        System.out.println("더한 결과 : >" + (n1 + n2));

    }
}
