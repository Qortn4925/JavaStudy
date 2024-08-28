package ch06.lecture.p03method;

import java.util.Arrays;

public class C08Varargs {
    public static void main(String[] args) {
        //var args ( variable argument)?

        MyClass08 m8 = new MyClass08();
        m8.method();
        m8.method(1);
        m8.method(2);
        m8.method2(5, 5, 3, 3);
        m8.method3(3, 3, 3, 3, 3, 3, 3, 3);
    }
}

class MyClass08 {
    public void method() {
        System.out.println("메소드");
    }

    public void method(int a) {
        System.out.println("메소드");
    }

    public void method(int a, int b) {
        System.out.println("메소드");
    }


    // 이렇게 작성하면 integer 형 파라미터를 0 ~ n개 까지 커버해줌  위에 처럼 , 데이터형이 같고 ,매개변수만 차이나는데
    //하는일이 같으면 이렇게 하면 됨
    public void method2(int... a) {
        System.out.println("메소드 2 할일");
    }

    public void method3(int... a) {
        // a를 배열로 사용 하면된다
        System.out.println("메소드 3");

        System.out.println(Arrays.toString(a));
        System.out.println(a.length + "  a의 길이");

    }
}
