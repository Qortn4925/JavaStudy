package ch05.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Sol09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        int menu;
        int[] score = null;
        boolean a = true;
        while (a) {


            System.out.println("선택");
            menu = sc.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("학생수>");
                    len = sc.nextInt(); // 배열의 길이 입력
                    score = new int[len];
                    System.out.println("학생수 입력이 끝나셨습니다");
                }
                case 2 -> {
                    System.out.println("점수입력");
                    for (int i = 0; i < len; i++) {
                        System.out.println(STR."score[\{i}] :");
                        score[i] = sc.nextInt();
                    }
                    System.out.println("점수 입력이 끝나셨습니다");

                }
                case 3 -> {
                    for (int i = 0; i < len; i++) {
                        System.out.println(STR."score\{i}=\{score[i]}");
                    }
                    System.out.println("점수 리스트종료");
                }
                case 4 -> {
                    int hap = 0;
                    Arrays.sort(score);
                    for (int i = 0; i < len; i++) {
                        hap += score[i];
                    }
                    System.out.println("최고점수:" + score[len - 1]);
                    System.out.println("평균은" + hap / len);


                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    a = false;

                }
            }
        }

    }
}
