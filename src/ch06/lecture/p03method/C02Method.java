package ch06.lecture.p03method;

public class C02Method {

    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.printName();
    }
}

class MyClass02 {
    //메소드 작성관습
    //메소드명(lowerCamelCase)

    //접근제한자 리턴타입 메소드명 (파라미터 목록)
    // 실행문들

    public void printName() {
        System.out.println("이름을 출력하는 메소드");
        System.out.println("메소드의 실행코드들이 여기 작성됨");
    }
}
