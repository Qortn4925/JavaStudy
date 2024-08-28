package ch06.lecture.p04Constructor.C01Constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        // 생성자를 따로 작성하지 않아도 >  생성자를 호출했음
        // 생성자를 작성하지 않으면 > 자동으로 파라미터가 없는 생성자가(no-args Constructor) 생성됨

        MyClass091 m1 = new MyClass091();
        MyClass092 m2 = new MyClass092(10);
    }
}

class MyClass091 {

}

class MyClass092 {
    // 파라미터 있는 생성자 작성시
    // 디폴트 생성자가 만들어 지지 않는다
    int age;

    MyClass092(int age) {
        this.age = age; // > 만들어지자 위에 오류
    }

}
