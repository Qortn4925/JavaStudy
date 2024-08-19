package ch02.lecture.p04conversion;

public class C05TypeConversion {
    public static void main(String[] args) {
        // 연산시 큰 타입으로 자동변환

        int a = 3;
        int b = 5;
        int c = a + b;
        int d = 3;
        long e = 5;
        long f = d + e;                 // >> long  지금은 작은수를 다루지만 큰 수를 다루고 있을수도 있으니까 ㅇㅇ
        // 그리고 큰 타입으로 다뤄서 계산함 즉   d+e의 결관는 long
        int g = 3;
        long h = 40_0000_0000L;
        long i = g + h;
        System.out.println("i = " + i);

        int j = 9;
        double k = 3.14;
        double l = j + k;           // double
        System.out.println("l = " + l);
    }
}
