package ch13.lecture.p02method;

public class C01Method {
    public static void main(String[] args) {
        MyClass1 o = new MyClass1();

        o.<String>action1();  // 볼 일 없음

        o.<String>action2();  //
        String s = o.<String>action2();  // 리턴타입은 ,보통 변수로 받아서 작성하는데 변수로 작성할때 데이터형 적어주니까 생략
        String a = o.action2();

        //파라미터가 스트링 타입 이니까 , <> 타입 파람부분 생략
        o.<String>aciotn3("java");
        o.aciotn3("abc");

        // 이것도 마찬 가지
        o.action4(3.14, 5L);
    }
}

class MyClass1 {


    //generic method: 타입 파라미터가 있는 메소드
    public <T> void action1() {

    }

    public <T> T action2() {

        return null;
    }

    public <T> void aciotn3(T param) {

    }

    public <T, U> void action4(T p1, U p2) {

    }

    public <T> T action(T p1) {
        return null;
    }

}
