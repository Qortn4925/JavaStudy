package ch06.lecture.p03method;

public class C04Method {
    public static void main(String[] args) {

        MyClass04 m4 = new MyClass04();

        m4.method1();
        m4.method();
    }
}

class MyClass04 {
    public void method1() {

        System.out.println("코드들");
    }

    public void method() {

        System.out.println("다른기능");
    }
}
