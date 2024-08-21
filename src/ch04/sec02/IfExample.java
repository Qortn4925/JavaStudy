package ch04.sec02;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        
        if (score >= 90) {
            System.out.println("점수가 90보다 큼");
        }
        if (score < 90) {
            System.out.println("점수가 90보다 작음");
        }
        System.out.println("등급은 ㅁㄴㅇㄴㅁㅇ입니다");        // 상시 실행문장
    }
}
