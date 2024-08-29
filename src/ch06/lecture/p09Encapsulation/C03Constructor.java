package ch06.lecture.p09Encapsulation;

public class C03Constructor {

}

class Super03 {

    Super03(int a) {

    }

}

class Sub03 extends Super03 {
    //자식클래스 생성자에서 부모클래스 생성자 호출 꼭 해야함  >> 부모의 의 인스턴스필드값에 접ㄱ근하려고
    //생성자를 만들지 않으면 기본 생성자가 추가됨


    Sub03() {
        //명시적으로 작성한 default 생성자
        // 부모 클래스의 default 생성자 호출 코드 작성하지 않으면 ,
        // 자동 추가됨
//        super();

        //부모 클래스의 파라미터 있는 생성자만 존재하면
        //명시적으로 부모 클래스의 파라미터 있는 생성자를 호출해야함   > 디폴트 > 디폴트 알아서 생성이지만 , 아니여서
        super(3);
    }
}
