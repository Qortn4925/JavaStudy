package ch02.lecture.p02type;

public class C01Type {
    public static void main(String[] args) {
        // 각 데이터형의 크기와  , 최대값

        //java data type 2가지
        //1.primitive type 8가지
        // byte:1 바이트 정수   short: 2바이트 정수
        //  int : 4 바이트     long :8 바이트
        // float: 4바이트 실수 , dobule : 8 바이트 실수
        // boolean : 1 바이트 논리
        // char: 2바이트 문자

        //2.reference type
        // >> primitive 타이블 제외한 나머지\
        int v1 = 2147483647;
        System.out.println("v1+1 = " + (v1 + 1));
        long v2 = 21474836480L;
        long v3 = 21_4700_4836_480L;

    }
}
