package ch02.lecture.p04conversion;

public class C03TypeConversion {
    public static void main(String[] args) {
        // 정수 <> 실수
        //정수 >> 실수 자동
        //실수 >>정수 자동  강제 형
        long a = 50000;
        double b = a;

        double c = 50000;
        long d = (long) c; //자동형변환 x  강제형변환 ok

        // 소수점 이하의 값을 버릴 때 주로 사용
        double e = 3.14;
        int f = (int) e;
    }
}
