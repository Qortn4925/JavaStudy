package ch02.sec02;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int val = Integer.parseInt("10");
        double val2 = Double.parseDouble("3.14");
        boolean val3 = Boolean.parseBoolean("true");

        System.out.println("val3 = " + val3);
        System.out.println("val = " + val);
        System.out.println("val2 = " + val2);

        String str = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str3 = " + str3);
        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

    }
}
