package ch02.lecture.p02type;

public class C02Double {
    public static void main(String[] args) {
        // 실수

        // float 4 byte
        // double 8 byte
        double b = 3.14;
        System.out.println("b = " + b);

        // float 은 F를 뒤에  long형 뒤에 L같은이야기
        float c= 3.14F;

        double d = 300000;
        double e = 3e6;  // 3 곱하기 10의 6승
        System.out.println("e = " + e);
        double  f = 314e-2;   // 3.14  314  xx 10-2
    }
}
