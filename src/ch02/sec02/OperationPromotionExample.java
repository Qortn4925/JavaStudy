package ch02.sec02;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte res = 10 + 20;
        System.out.println("res = " + res);
        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2;
        System.out.println("result = " + result);
        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3 = " + result3);

        char v6 = 'A';
        char v7 = 1;
        int res2 = v6 + v7;
        System.out.println("res2 = " + res2);
        int v8 = 10;
        int res3 = v8 / 4;
        System.out.println("res3 = " + res3);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6 = " + result6);

        int v10 = 1;
        int v11 = 2;
        double re = (double) v10 / v11;
        System.out.println("re = " + re);
    }
}
