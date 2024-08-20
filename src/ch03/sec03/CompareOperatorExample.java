package ch03.sec03;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 10;
        boolean res = num == num1;
        boolean res1 = num != num1;
        boolean res2 = num <= num1;
        System.out.println("res2 = " + res2);
        System.out.println("res1 = " + res1);
        System.out.println("res = " + res);

        char cr1 = 'A';
        char cr2 = 'B';
        boolean re3 = cr1 < cr2;
        System.out.println("re3 = " + re3);

        int num3 = 1;
        double num4 = 1.0;
        boolean res4 = num3 == num4;
        System.out.println("res4 = " + res4);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = num6 == num5;
        boolean result7 = num5 == (float) num6;
        System.out.println("result7 = " + result7);
        System.out.println("result6 = " + result6);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = str1.equals(str2
        );
        boolean result9 = !(str1.equals(str2));

        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);
    }
}
