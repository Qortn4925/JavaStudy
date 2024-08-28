package ch06.lecture.p05static;

public class C01Field {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01 a1 = new MyClass01();
        o1.age = 10;
        a1.age = 5;
        System.out.println("a1.age = " + a1.age);
        System.out.println("a1.age = " + o1.age);

        MyClass01.number = 50;

        System.out.println("MyClass01.number = " + MyClass01.number);

    }
}

class MyClass01 {
    int age; // >> instance field >> 객세 생성시 객체가 가질 값
    // 
    static int number;  //  class field , static field, 정적 필드 

}