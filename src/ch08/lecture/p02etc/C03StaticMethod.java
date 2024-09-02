package ch08.lecture.p02etc;

public class C03StaticMethod {
    public static void main(String[] args) {
        MyInterface3.someMethod();

    }
}

interface MyInterface3 {
    //public static final field

    //public abstract method

    //default method;
    //: 코드 구현이 가능한 인스턴스 메소드

    // public static method
    // : 코드 구현이 가능한  스태틱 메소드 클래스 메소드

    static void someMethod() {
        System.out.println("MyInterface3.someMethod");
    }
}
