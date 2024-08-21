package ch04.lecture.p04for;

import java.util.Scanner;

public class C02GuGuDAN {
    public static void main(String[] args) {
        //for, while
        Scanner sc = new Scanner(System.in);
        System.out.println("단 수를 선택해주세요");
        int k = sc.nextInt();
        if (2 <= k && k <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(STR."\{k} * \{i} = " + (k * i));
            }
        }
        int count = 0;
        while (count < 10) {

            System.out.println((count * k) + STR." = \{count} * \{k}");
            count++;
        }

    }
}
