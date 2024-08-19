package ch02.lecture.p03String;

public class C06ToString {
    public static void main(String[] args) {

        //기본타입 을 > string으로
        // valueof. 메소드
        // + 연산자
        int a = 33;
        String b = String.valueOf(a);
        String c = "" + a;      // ""빈 공간에 a추가
        String d = a + "";
    }
}
