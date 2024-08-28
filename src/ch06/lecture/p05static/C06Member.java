package ch06.lecture.p05static;

import java.sql.SQLOutput;

public class C06Member {
    public static void main(String[] args) {

        MyClass06 a = new MyClass06();
        a.method2();
    }
}

class MyClass06 {
    static int num = 5;
    int age = 10;

    static void method() {
        System.out.println(num);
//        System.out.println(age);
    }

    void method2() {
        System.out.println(num);
        System.out.println(age); // 둘 다 가능 이다 !
        method(); // 당연히 이것도 가능

    }
}
//member: field, method, 생성자

// 스태틱 > 인스턴스  접근 ㅌ
// 인스턴스 >> 스태틱 접근 o  당연한 이야기다
