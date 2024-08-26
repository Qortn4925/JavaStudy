package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.powerOn();

        int result = cal.plus(3, 5);
        System.out.println(result);
        int x = 10;
        int y = 2;

        double result1 = cal.divide(x, y);

        System.out.println(result1);

        cal.powerOff();
    }
}
