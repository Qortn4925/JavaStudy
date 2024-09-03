package ch16.lecture.p02method_reference;

public class C03InstanceMethod {
    public static void main(String[] args) {
        MyClass3 a = new MyClass3();
        MyInterface31 o = x -> {
            a.action1(x);
        };

        MyInterface31 C = a::action1;


        MyInterface32 q = (s, t) -> a.action2(s, t);
        MyInterface32 l = a::action2;
    }

}

class MyClass3 {
    void action1(int x) {
        System.out.println(x);
    }

    void action2(String s, String t) {
        System.out.println(s + t);
    }
}

interface MyInterface32 {
    void some(String s, String t);
}

@FunctionalInterface
interface MyInterface31 {
    void method(int x);
}
