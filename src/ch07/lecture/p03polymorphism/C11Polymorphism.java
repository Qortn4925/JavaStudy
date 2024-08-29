package ch07.lecture.p03polymorphism;

public class C11Polymorphism {

    public static void main(String[] args) {
        Bear11 bear11 = getBear();  // static 이라 c11poly 객체 생성 없이 접근 가능
        bear11.hunt();

        // bear 11 이 50의 확률을 뚫고  북극곰의 인스턴스를 가졌다면 // 북금곰인게 확실하니까  북금곰 클래스의 swim
        if (bear11 instanceof WhiteBear11 b) {
            b.swim();
        }

    }

    public static Bear11 getBear() {
        double r = Math.random();

        if (r < 0.5) {
            return new BrownBear11();
        }
        return new WhiteBear11();
    }
}

class Bear11 {
    public void hunt() {
        System.out.println("사냥합니다");

    }
}

//불곰
class BrownBear11 extends Bear11 {

    @Override
    public void hunt() {
        System.out.println("연어를 사냥합니다");
    }
}

//부그꼼
class WhiteBear11 extends Bear11 {

    @Override
    public void hunt() {
        System.out.println("바다 표범 사냥");
    }

    public void swim() {
        System.out.println("북극곰이 바다를 헤엄침");
    }
}
