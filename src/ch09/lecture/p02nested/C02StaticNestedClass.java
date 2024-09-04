package ch09.lecture.p02nested;

public class C02StaticNestedClass {

    public static void main(String[] args) {

        // a.~로 들어갔는데
        MyClass2.Nested2 o = new MyClass2.Nested2();

        MyClass2 a = new MyClass2();

        MyClass2.Nested1 a2 = a.new Nested1();
    }
}

class MyClass2 {

    //    @formatter:off
    //인스턴스 중첩 클래스
    class Nested1 {}

    //스태틱 중첩 클래스
    static class Nested2{}

    void someMethod(){
        Nested1 a= new Nested1();
        Nested2 b = new Nested2();
    }
}
