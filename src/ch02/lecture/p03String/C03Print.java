package ch02.lecture.p03String;

public class C03Print {
    public static void main(String[] args) {
        System.out.printf("형식 문자열%s", "이름 등등");
        System.out.printf("형식 문자열 여러 개 %s , %s, %n", "첫번째", "두번째");
        // 10개 공간 먹고 뒤에 파라미터 , %10s
        System.out.printf("형식 %10s%10s%n", "abc", "def");

        //%-10s >> 왼쪽 정렬후
        System.out.printf("형식 %-10s%-10s%n", "abc", "def");

        //%d > 정수출력(byte ,short, int ,long)
        // %f : t실수 (float, double)
        System.out.printf("실수%010.1f, %010.3f", 3.14, 9.123333);
    }
}
