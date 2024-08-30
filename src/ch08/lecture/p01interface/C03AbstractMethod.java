package ch08.lecture.p01interface;

public class C03AbstractMethod {

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
