package ch06.lecture.p06final;

public class C01Final {
    //final : 변수의 값을 바꾸지 못하게 하는 키워드
    // > 변수에 값을 한 번만 할당할 수 잇음.

    public static void main(String[] args) {
        int a = 3;
        System.out.println("a = " + a);
        a = 4;
        System.out.println("a = " + a);

        final int b;
        b = 10;
        System.out.println("b = " + b);
//        b = 5;    이미 고정 되서 변경 불가능
        System.out.println("b = " + b); // 10으로 출력
    }


}
