package ch09.lecture.p02nested;

public class C06Lambda {


    public static void main(String[] args) {
        int a = 5;
        MyInterface6 o = () -> {
            //local 클래스에서
            // 감싸고 잇는 메소드의 지역변수 (파라미터) 의 값을 변경할 수 없음
            //a=7;
        };
        o.someAction();
    }

}


@FunctionalInterface
interface MyInterface6 {

    void someAction();
}
