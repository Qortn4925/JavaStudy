package ch03.exercise;

public class Sol7 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;

        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌수 없음");
        } else {
            double result = z + 10;
            System.out.println("result = " + result);
        }
    }
}
