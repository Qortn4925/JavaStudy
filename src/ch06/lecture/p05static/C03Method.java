package ch06.lecture.p05static;

public class C03Method {
    public static void main(String[] args) {

        MyClass03 a = new MyClass03();
        a.method();
        MyClass03.method1();

    }
}

class MyClass03 {
    //관리할 필요 없이 바로 접근해야하는 성격을 가진 것들에는
    // static을 통해서 관리하면 될듯
    void method() {
        System.out.println("MyClass04.method");
    }

    static void method1() {
        System.out.println("MyClass04.method1");
    }
}
