package ch07.exercise.s12;

public class Example {
    public static void main(String[] args) {

        action(new A());
        action(new B());
        action(new C());
    }

    public static void action(A a) {
        a.method1();

        if (a instanceof C c) {
            c.method2();
        }
    }
}


class A {

    public void method1() {
        System.out.println("A.instance initializer");
    }
}

class B extends A {

    @Override
    public void method1() {
        System.out.println("B.method1");
    }
}

class C extends A {

    @Override
    public void method1() {
        System.out.println("C.method1");
    }

    public void method2() {
        System.out.println("C.method2");
    }

}
