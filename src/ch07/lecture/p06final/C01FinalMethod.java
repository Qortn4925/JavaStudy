package ch07.lecture.p06final;

public class C01FinalMethod {


}

class Fish1 {

    //final method: 자식클래스에서 재정의 못함 > 변동사항이 없어야하는 내용인데
    //오버라이딩으로 변동할 수 있으니까 fianl을 명시해서 모 학 ㅔ마ㄱ금
    final public void breathe() {
        System.out.println("숨을 쉰다~");
    }

    public void swime() {
        System.out.println("헤엄 ~ 헤엄");
    }
}


class Domi1 extends Fish1 {

    // 안되도록!
//    @Override
//    public void breathe() {
//        System.out.println("폐호흡합니다.");
//    }

    @Override
    public void swime() {
        System.out.println("천천히 헤엄");
    }
}

class Tuna1 extends Fish1 {


    @Override
    public void swime() {
        System.out.println("빠르게 헤엄");
    }
}


