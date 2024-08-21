package ch04.lecture.p01if;

import java.util.Random;

public class C07Random {


    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("dice = " + dice);

        // Random 클래스 사용
        Random random = new Random();
        int j = random.nextInt(6) + 1;
        System.out.println("j = " + j);
    }
}
