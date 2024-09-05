package ch12.sec06;

public class VauleCompareExample {
    public static void main(String[] args) {


        Integer obj1 = 300;
        Integer obj2 = 300;

        // -128 ~ 127 이상
        System.out.println("== " + (obj1 == obj2));
        System.out.println("equals " + obj1.equals(obj2));
        System.out.println();

        Integer obj3 = 10;
        Integer obj4 = 10;
        //-128~127 사이
        System.out.println("== " + (obj3 == obj4));
        System.out.println("equals " + obj3.equals(obj4));
    }
}
