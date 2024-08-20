package ch03.lecture.p01arithmethic;

public class C02Arithmetic {
    public static void main(String[] args) {
        // 연산 결과의 타입은 피연산중 큰 타입으로 결정
        // int 와 long의 결과는 >> long

        long e = 7L;
        double f = 3.14;
//        long g = e+f ;   >> double
        // 나누기 (/) : 정수 끼리의 연산 결과는 정수
        System.out.println(10 / 3);
        // 실수 끼리 연산
        System.out.println(10.0 / 3.0);  // 3.33333
        System.out.println(10 / 3.0); // 똑같음
    }
}
