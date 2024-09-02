package ch08.lecture.p02etc;

public class C02DefaultMethod {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        o.method1();
        o.method2();

        MyInterface2 l = new MyClass22();
        l.method2();
        l.method1();
    }

}

interface MyInterface2 {
    void method1();

    //메소드를 하나 추가 할때마다 구현클래스에 오버라이딩을 해줘야함
    // 이게 너무 귀찮으니까
    //default method 에 한해서  코드블럭이 있는 메소드를 허용해주자
    // 재정의 할 필요는 없지만 ,가지고 있음
    default void method2() {
        System.out.println("MyInterface2.method2");
    }
}

class MyClass21 implements MyInterface2 {

    @Override
    public void method1() {
        System.out.println("MyClass21.method1");

    }
}

class MyClass22 implements MyInterface2 {

    @Override
    public void method1() {
        System.out.println("MyClass22.method1");
    }
}
