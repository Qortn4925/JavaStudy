package ch04.sec02;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수회원");
            }
            case 'B', 'b' -> {
                System.out.println("우수회원");
            }
            default -> {
                System.out.println("손닙입니다.");
            }
        }
    }
}
