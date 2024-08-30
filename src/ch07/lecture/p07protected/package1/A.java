package ch07.lecture.p07protected.package1;

public class A {

    // 어디서든
    public void publicMethod() {
        System.out.println("A.publicMethod");
    }

    //protected: 같은 패키지에 있으면 사용 가능 + 다른 패키지여도 상속 관계면
    protected void protectedMethod() {
        System.out.println("A.protectedMethod");
    }

    // 같은 패키지 내부에서만 
    void packagePrivateMethod() {
        System.out.println("A.packagePrivateMethod");
    }
}
