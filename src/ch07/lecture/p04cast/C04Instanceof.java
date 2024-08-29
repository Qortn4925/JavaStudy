package ch07.lecture.p04cast;

public class C04Instanceof {
    public static void main(String[] args) {
        //instance of
        // 연산값 >> boolean ,
        //왼쪽항 : 참조 변수
        //오른쪽 : 타입 (클래스,인터페이스)
        //a instance of b    a참조변수가  가리키는 인스턴스를 오른쪽 타입이면 true

        A a = new A();
        System.out.println(a instanceof A); // A 말고 false
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(a instanceof E);
        System.out.println(a instanceof F);

        System.out.println("b객체");
        B b = new B();
        System.out.println(b instanceof A); // A,B 말고 false
        System.out.println(b instanceof B);
//        System.out.println(b instanceof C);
        System.out.println(b instanceof D);
        System.out.println(b instanceof E);
//        System.out.println(b instanceof F);
        System.out.println("D객체");
        D d = new D();
        System.out.println(d instanceof A); // A,B,D 말고 false
        System.out.println(d instanceof B);
//        System.out.println(b instanceof C);
        System.out.println(d instanceof D);
//        System.out.println(d instanceof E);
//        System.out.println(b instanceof F);
        System.out.println("F인스턴스 A타입 변수에");
        A z = new F();
        System.out.println(z instanceof A); // A,C,F 말고 false
//        System.out.println(z instanceof B);
        System.out.println(z instanceof C);
//        System.out.println(z instanceof D);
//        System.out.println(z instanceof E);
        System.out.println(z instanceof F);

    }
}

// @formatter:off
class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends B{}

class F extends C{}