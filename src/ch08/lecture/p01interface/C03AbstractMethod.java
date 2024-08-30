package ch08.lecture.p01interface;

public class C03AbstractMethod {

    public static void main(String[] args) {
        MyInterface3 o = new MyClass03();

        o.otherMethod();
        o.otherMethod2();
        o.otherMethod3();
        o.someMethod();
    }
}

interface MyInterface3 {
    //public abstract 메소드 ?
    //인터페이스의 메소드 == public abstract method
    // 추상이기에 구현 안함   ^ㅡ^

    public abstract void someMethod();

    abstract void otherMethod();

    public void otherMethod2();

    void otherMethod3();  //  4개 다 똑같음 , 생략 하삼
}

class MyClass03 implements MyInterface3 {
    // abstact 메소드는  > 추상 무조건 재정의 해줘야함


    @Override
    public void someMethod() {

    }

    @Override
    public void otherMethod() {

    }

    @Override
    public void otherMethod2() {

    }

    @Override
    public void otherMethod3() {

    }
}
