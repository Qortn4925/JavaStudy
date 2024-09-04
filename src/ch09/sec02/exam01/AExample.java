package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        A a = new A();


        //B의 생성자는 A클래스 안에 들어가 있기 때문에 접근도 저렇게 한느듯?
        A.B b = a.new B();
    }
}
