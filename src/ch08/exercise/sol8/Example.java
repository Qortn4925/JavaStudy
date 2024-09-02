package ch08.exercise.sol8;

public class Example {
    public static void main(String[] args) {
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
