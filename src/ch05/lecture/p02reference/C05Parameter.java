package ch05.lecture.p02reference;

public class C05Parameter {
    public static void main(String[] args) {
        int b = 5;
        method(3);
        method(b);

    }

    public static void method(int a) {  // a= parameter,arguments
        System.out.println("a = " + a);
    }
}
