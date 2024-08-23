package ch05.lecture.p02reference;

public class C08Parameter {
    public static void main(String[] args) {
        int b = 5;
        method(b);
    }

    public static void method(int a) {
        System.out.println(a);
        a = 55;
    }
}
