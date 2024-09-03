package ch16.lecture.p01rambda;

public class C03Lambda {
    public static void main(String[] args) {
        //람다를 사용가능한 경우에는
        // 추상 메소드가 하나인 인터페이스 > 그래야 나머지 사항들이 자동으로 유추가 가능함
        // 당연히 이거밖에 없으니까 생략해줘도 ok 
        // 람다식은 펑셔널 인터페이스의  익명클래스 객체

        MyInterface3 o = () -> {
        };
        o.some();
    }
}

//Functional Interface : 추상 메소드가 하나인 인터페이스
interface MyInterface3 {

    void some();
}
