package ch09.sec02.exam02;

public class A {
    class B {
        int field = 1;

        static int field2 = 2;

        B() {
            System.out.println("B.B");
        }

        void method1() {
            System.out.println("B.method1");
        }

        static void method2() {
            System.out.println("B.method2");
        }

    }

    void useB() {
        B b = new B();
        System.out.println(b.field);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }

}
