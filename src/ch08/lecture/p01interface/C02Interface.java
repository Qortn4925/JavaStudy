package ch08.lecture.p01interface;

public class C02Interface {
    public static void main(String[] args) {
        MyClass11 o1 = new MyClass11();
        MyClass12 o2 = new MyClass12();
        MyInterface1 o3 = o1;

        MyInterface1 o4 = o2; // isa  논리 ,  지동 형변환

    }
}

//interface: 여러 클래스의 객체를 하나의 타입으로 묶음

//@formatter:off
interface  MyInterface1{}


// 클래스 a 가 인터페이스 b를 구현했(implements)다

//구현클래스 (concreate class, 구상 , 구체 클래스)
class MyClass11 implements  MyInterface1{}


class  MyClass12 implements  MyInterface1{}


