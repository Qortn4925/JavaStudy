package ch07.lecture.p05abstract;

import ch06.sec13.exam03.package1.B;

public class C01AbstractClass {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();

        horse1.walk();

        Bear1 be = new Bear1();
        be.walk();

        Mammal1 mammal1 = new Horse1();
        //홀스의 메소드
        mammal1.walk();

//        M0ammal1 m1 = new Mammal1(); 포유류라는건 실제로 존재하는게 아니라 , 분류하기 위한거 아니냐
        //abstract class 도 똑같다 .  abstract 클래스는 인스턴스 생성만 막아줌
    }

}


//포유류

abstract class Mammal1 {
    public void walk() {
        System.out.println("걷다");
    }


}

// 말
class Horse1 extends Mammal1 {
    @Override
    public void walk() {
        System.out.println("말이 달린다");
    }
}

class Bear1 extends Mammal1 {

    @Override
    public void walk() {
        System.out.println("곰이 기어다님");
    }
}
