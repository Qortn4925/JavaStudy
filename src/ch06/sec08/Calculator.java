package ch06.sec08;

public class Calculator {
    public static void main(String[] args) {

    }

    void powerOn() {
        System.out.println("전원을 킵니다");
    }

    void powerOff() {
        System.out.println("전원을 끕니다");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }
    
}
