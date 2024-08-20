package ch03.sec02;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int reult = v1 + v2;            // 바이트 바이트 합 (byte, short, int)의 연산결과>> int
        System.out.println("reult = " + reult);

        long reult1 = v1 + v2 - v4;    // 연산 결과중 제일 큰 타입ㅇ니 long
        System.out.println("reult1 = " + reult1);
        double reult2 = (double) v1 / v2;        // 작은 데이터형 >> 큰 형  강제 캐스팅
        System.out.println("reult2 = " + reult2);
        int reult3 = v1 % v2;                   //  작은거 >> 큰거 > 자동
        System.out.println("reult3 = " + reult3);
    }
}
