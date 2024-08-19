package ch02.sec02;

public class PromotionExample {
    public static void main(String[] args) {
        byte btval = 10;
        int intval = btval;
        System.out.println("intval = " + intval);

        char charValue = '가';
        intval = charValue;
        System.out.println("가의 유니코드 = " + intval);

        intval = 50;
        long longval = intval;
        System.out.println("longval = " + longval);
        longval = 100;
        float floatval = longval;
        System.out.println("floatval = " + floatval);

        floatval = 100.5f;
        double doubleval = floatval;
        System.out.println("doubleval = " + doubleval);
    }
}
