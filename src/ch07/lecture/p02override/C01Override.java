package ch07.lecture.p02override;

public class C01Override {
    public static void main(String[] args) {
        Sub01 o = new Sub01();

        o.method2(); // override 되어서 ,  자식의 메소드 1  실행
        o.method1();
    }

}

class Super01 {
    public void method1() {

        System.out.println("Super.method1");

    }
}

class Sub01 extends Super01 {

    // 메소드1 존재 > super01
    //메소드1 은 존재하지만 > 다른 기능을 하도록 덮어 쓸수 있다. > (재정의, override)
    public void method1() {
        System.out.println("Sub01.method1");
    }

    public void method2() {
        System.out.println("sub01.method2");
    }

}
