package ch02.lecture.p06Scanner;

import java.util.Scanner;

public class C07Scaneer {
    public static void main(String[] args) {

        // nextline 은  입력 받능 값을 다른 데이터형으로 바꾸는 메소드가 없지만  next는 있음 상대적으로 변환하기 쉬워서 그런듯
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 한 줄에 띄워서 입력 >");

        double a = scanner.nextDouble();              //nextDouble
        double b = scanner.nextDouble();

        System.out.println("더한 값 = " + (a + b));
        
    }
}
