package ch07.lecture.p05abstract;

public class C02AbstractMethod {
    public static void main(String[] args) {
        Mammal2 a = new Bear2();
        Mammal2 b = new Horse2();

        a.walk();
        b.walk();
    }

}

//abstract method(추상 메소드)
//: 코드 블럭이 없는 메소드

//추상 메소드를 가진 클래스는 반드시 추상 클래스
abstract class Mammal2 {

    abstract void walk();

}


class Bear2 extends Mammal2 {

    @Override
    void walk() {
        // 상위 클래스의 추상메소드를  반드시 작성해야함
        // 인스턴스를 만들고 싶은 클래스면 반드시 오버라이딩을 해야하고
        // 그러지 않을꺼면 그냥 이 클래스도 abstract로 변환

        System.out.println("고믐");
    }
}

class Horse2 extends Mammal2 {

    @Override
    void walk() {
        System.out.println("");
    }
}


