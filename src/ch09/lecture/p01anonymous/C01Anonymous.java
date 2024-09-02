package ch09.lecture.p01anonymous;

import ch08.exercise.sol8.C;

public class C01Anonymous {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.someMethod();

        Parent1 c = new Child();
        c.someMethod();

        //anonymous class
        //상속받아서 새 클래스 만들고
        // + 인스턴스 생성

        Parent1 a = new Parent1() {
            //자식 클래스 코드들
            //필드 ,메소드만 작성 가능 > 생성자 x

            @Override
            public void someMethod() {
                System.out.println("C01Anonymous.someMethod");
                //한 번 정도 쓰고 말아야하는 특수상황에 ?
            }
        };
        a.someMethod();
    }
}


class Parent1 {
    public void someMethod() {
        System.out.println("Parent1.someMethod");
    }


}

class Child extends Parent1 {
    @Override
    public void someMethod() {
        System.out.println("Child.someMethod");
    }
}
