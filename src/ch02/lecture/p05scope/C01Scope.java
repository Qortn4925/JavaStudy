package ch02.lecture.p05scope;

public class C01Scope {
    // {} : 코드 블록
    // {} : 코드 블록
    // 선언된 변수는 코드 블럭 내에서만 사용 가능
    public static void main(String[] args) {

        int a = 3;
        System.out.println("a = " + a);
        if (true) {
            int b = 5;
            System.out.println("b = " + b);
        }
        //        System.out.println("b = " + b);   >> 오류 발생 b 는 이프 문에서 선언된 지역변수라서 
        int c;
        c = 10;
        if (true) {
            System.out.println("c = " + c);
        }
        System.out.println("c = " + c);
    }

    public static void method() {
//        System.out.println("true = " + true);
    }

}
