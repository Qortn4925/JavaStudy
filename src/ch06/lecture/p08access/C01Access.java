package ch06.lecture.p08access;

public class C01Access {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();

//        o.method2();

        o.method1();
    }
}

class MyClass01 {

    void method1() {
        method2();
    }

    private void method2() {
        System.out.println("어떤일 , 메소드2 , 다른 곳에서 접근하면 안되는일 ");
    }

}
