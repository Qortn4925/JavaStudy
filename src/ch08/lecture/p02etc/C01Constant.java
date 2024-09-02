package ch08.lecture.p02etc;

public class C01Constant {

}


interface MyInterface {
    //필드 >> 인스턴스를 만들수 없으니까
    //항상 final static 필드 (상수)
    // + 인터페이스 작성 되는 모든건 public
    int AGE = 0;
    static String NAME = "SON";
    final int Number = 99;
    static double PI = 3.141592;
    public final static String MY_ADDRESS = "KOREA";

    //public abstract > 그렇다
    void method1();

}
