package ch04.Exercise;

import java.util.Scanner;

public class Sol07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money = 0;
        while (run) {
            System.out.println("----------------");
            System.out.println("1. 예금 |2.   출금 |3.  잔고|4.   종료");
            System.out.println("----------------");
            System.out.println("선택");

            int selnum = sc.nextInt();

            switch (selnum) {
                case 1 -> {

                    System.out.println("예금액>");
                    int k = sc.nextInt();
                    money = money + k;
                }

                case 2 -> {
                    System.out.println("출금액");
                    int k = sc.nextInt();
                    money = money - k;

                }
                case 3 -> {
                    System.out.println("잔고 >" + money);
                }
                case 4 -> run = false;
            }

        }
    }
}
