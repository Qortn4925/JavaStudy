package ch09.sec02.exam02;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        a.useB();
        
        //B생성자 호출
        A.B b = a.new B();
    }
}
