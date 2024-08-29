package ch07.lecture.p02override;

public class C02Override {

}

class Parent02 {
    public void method1() {
        System.out.println("Parent02.method1");
    }

    public void method2() {
        System.out.println("Parent02.method2");
    }
}

class Child02 extends Parent02 {


    //@Overrider : Override annotation(애노테이션)
    @Override
    public void method1() {
        System.out.println("Child02.method1");
    }

    // 단축기는 상위 클래스의 일부정도만 쳐보던가  alt +insert 키를 눌러서 생성자 , 게터 세터 만들듯이
    @Override
    public void method2() {
        super.method2();
    }
}
