package ch07.lecture.p02override;

import ch06.sec13.exam03.package2.C;

public class C03Super {
    public static void main(String[] args) {
        Child03 c = new Child03();
        c.method1();


    }
}

class Parent03 {
    public void method1() {
        System.out.println("매우 ~~~~~~~~~~~~~~~~~~~~긴");
    }
}

class Child03 extends Parent03 {

    @Override
    public void method1() {
        super.method1(); // 위에 매우 ~~~~~~~~~~~~긴 코드를 추가하고   상위 타입의 메소드에 추가로 작성하고 싶을떄 이렇게
        // 또 상위 메소드의 변동사항을 관리 할수 있다는 장점
        System.out.println("또 다른 코드들 ");
    }
}
