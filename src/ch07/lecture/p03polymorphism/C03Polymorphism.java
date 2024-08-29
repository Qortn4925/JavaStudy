package ch07.lecture.p03polymorphism;

public class C03Polymorphism {
    public static void main(String[] args) {
        Super03 domi = new Sub031(); // 도미객체
        Super03 tuna = new Sub032();

        domi.eat();     // 미역 > 왜냐 ?  실제 인스턴스는 도미 객체를 해서 대입한거라 오버라이딩된 메소드를 호출
        tuna.eat();     //작은 물고기
    }
}

class Super03 {

    //어류

    public void eat() {
        System.out.println("먹이를 먹다");
    }
}

class Sub031 extends Super03 {
    //도미


    @Override
    public void eat() {
        System.out.println("미역을 먹습니다.");

    }
}

class Sub032 extends Super03 {
    //참치
    @Override
    public void eat() {
        System.out.println("작은 물고기를 먹습니다.");
    }
}
