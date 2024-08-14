package ch02.sec02;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지");

        } else {
            System.out.println("시작");
        }
        int x = 10;
        boolean result = (x == 20);  // >>  false
        boolean result2 = (x != 20); // >> true
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

    }
}
