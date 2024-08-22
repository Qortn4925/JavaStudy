package ch05.lecture.p01array;

public class C02Array {
    public static void main(String[] args) {
        int[] a; // 인트형 배열  배열명 a

        a = new int[3]; // a=  int형 변수 3 개를  따로 분리하는 공간을 만들어서 관리하겠다
        a[0] = 33;
        a[1] = 44;
        a[2] = 55;
//        a[3] = 66;    배열의 범위를 벗어나 오류 발생!

        System.out.println("a[0] = " + a[0]);
        System.out.println("a[0] = " + a[1]);
        System.out.println("a[0] = " + a[2]);
//        System.out.println("a[0] = " + a[3]);
    }
}
