package ch16.lecture.p01rambda;

public class C04FunctionalInterface {

}

//Functional Interface

@FunctionalInterface
interface MyInterface4 {
    // 추상 메소드만. 하나면 됨
    int MAX_VALUE = 100;

    void method1();

    default void method2() {
    }

    private void method3() {
    }

    static void method4() {
    }

    private static void method5() {
    }

}
//@FunctionalInterface  >> 추상메소드 하나만 가지는 인터페이스인지 확인해줌

interface MyInterface42 {

}

interface MyInterface43 {
    void method1();

    void method2();
}