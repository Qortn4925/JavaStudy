package ch02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
        // 한줄 주석   ctrl + /
        System.out.println("hello");
        System.out.println("world");
        /*
        여러줄 주석  희희
         */
//         변수(variable) : 값을 저장하는 이름 있는 공간
     // 데이터형 변수명 =
        int a =10;
        System.out.println(a);
        a=20;
        System.out.println(a);
        // 타입에 맞는 값만 넣을 수 있다.
//         a = 3.14 >> 실수
        // 정수형 변수 공간 b 생성
        int b;
        //초기화 되지 않은 변수는 사용할 수 없당 ㅋ0ㅋ
//        System.out.println(b);

        b =3 ;
        System.out.println(b);
        int c  =100;
        System.out.println(c);

    }

}
