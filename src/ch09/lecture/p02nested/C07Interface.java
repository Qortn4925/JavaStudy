package ch09.lecture.p02nested;

public class C07Interface {
    public static void main(String[] args) {
        MyClass7.Nestde7 o = new MyClass7.Nestde7() {
        };


    }
}


interface Nested7 {

}

class MyClass7 {

    //중첩된  인터페이스 (static) 생략
    static interface Nestde7 {
    }

    void someMethod() {
        Nested7 o = new Nested7() {
        };
    }
}


interface MyInterface7 {

}
