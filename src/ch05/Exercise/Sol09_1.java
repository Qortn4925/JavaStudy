package ch05.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Sol09_1 {
    public static void main(String[] args) {
        Sol09_1 so = new Sol09_1();
        // 객체지향으로 풀어보기
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int menu;
        int student = 0;
        int[] arr = null;
        while (a) {


            System.out.print("선택 >>");
            menu = sc.nextInt();
            switch (menu) {
                case 1 -> {
                    student = so.setArray();
                }
                case 2 -> {

                    arr = so.setScore(student);
                }
                case 3 -> {
                    so.showScorelist(arr);
                }
                case 4 -> {
                    so.calculatorScoreList(arr);
                }
                case 5 -> {
                    a = so.turnOff();
                }

            }
        }

    }

    public int setArray() {
        System.out.print("학생수를 입력해주세요 >>");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        return k;
    }

    public int[] setScore(int k) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[k];

        for (int i = 0; i < score.length; i++) {
            System.out.println(STR."score[\{i}] :");
            score[i] = sc.nextInt();
        }
        return score;
    }

    public void showScorelist(int[] score) {

        for (int i = 0; i < score.length; i++) {
            System.out.println(STR."score\{i}=\{score[i]}");
        }
        System.out.println("점수 리스트종료");

    }

    public void calculatorScoreList(int[] score) {
        int hap = 0;
        int len = score.length;


        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            hap += score[i];
        }
        System.out.println("최고점수:" + score[len - 1]);
        System.out.println("평균은" + hap / len);

    }

    public boolean turnOff() {
        System.out.println("프로그램 종료");
        return false;
    }
}
