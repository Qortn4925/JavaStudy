package ch06.sec10;

public class CalculatorExample {
    public static void main(String[] args) {
        double result = 10 * 10 * Calculator.pi;

        int result2 = Calculator.plus(10, 5);
        int resul1 = Calculator.minus(10, 5);
        System.out.println("resul1 = " + resul1);
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }

}
