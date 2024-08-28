package ch06.sec08;

public class CalculatorExample1 {
    public static void main(String[] args) {
        Calculator1 cal1 = new Calculator1();

        // 정사각형
        double a = cal1.areaRectange(10.0);
        // 직사각형
        double b = cal1.areaRectange(5.0, 8.0);

        System.out.println("정사각형" + a);
        System.out.println("직사각형" + b);
    }

}
