package ch06.lecture.p04Constructor.C01Constructor;

import java.sql.SQLOutput;

public class C01Constructor {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01();

    }
}

class MyClass01 {
    //필드

    //생성자
    //객체가 처음 만들어 질 때 해야하는 일들 작성
    // > 주로 필드 초기화


    // 생성자명 , 파라미터 목록 실행코드
    MyClass01() {
        System.out.println("ababab");
    }

}
