package ch04.Exercise;

public class Sol04 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 6) + 1;
        int num2 = (int) (Math.random() * 6) + 1;

        while (num1 + num2 != 5) {
            System.out.println(STR."(눈1:\{num1} ,눈2:\{num2} 합: \{num1 + num2})");

            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;

        }
        System.out.println("반복문 탈출");
        System.out.println(STR."(눈1:\{num1} ,눈2:\{num2} 합: \{num1 + num2})");
    }
}
