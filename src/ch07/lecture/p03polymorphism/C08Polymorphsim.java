package ch07.lecture.p03polymorphism;

public class C08Polymorphsim {
    public static void main(String[] args) {

        Fish8 f = new Fish8();
        Bear8 b = new Bear8();

        living(f);  // living은 void고 ,  breathe 도 void라  리턴값 따로 필요없어서 이렇게 실행 가ㅡㄴㅇ
        living(b);
    }

    public static void living(Aniaml8 a) {
        a.breathe();
//        a.swim(); // > 물고기
//        a.hunt(); // 곰
    }
}

class Aniaml8 {

    public void breathe() {
        System.out.println("동물이 숨쉬다.");


    }
}

class Fish8 extends Aniaml8 {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }

    public void swim() {
        System.out.println("헤엄");
    }

}

class Bear8 extends Aniaml8 {

    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }

    public void hunt() {
        System.out.println("사냥중");
    }
}
