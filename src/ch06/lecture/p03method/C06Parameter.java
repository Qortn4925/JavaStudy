package ch06.lecture.p03method;

import java.util.Arrays;

public class C06Parameter {
    public static void main(String[] args) {

        MyClass06 m6 = new MyClass06();
        int b = 10;
        m6.method1(b);
        // 기본형은 메소드 안에서 바꿔도 이렇다~
        
        System.out.println(b);
        int[] arr = {1, 2, 3, 4};
        m6.method2(arr);    //이때는 참조값이 넘어감
        //그래서 메소드 안에서 변경해도  주소값 따라가서 변경했기때문에 값도 따라간다 듣자마자 궁금했는데
        System.out.println(arr[0]);

        // 파라미터에 변수의 값이 전달됨 .
    }
}

class MyClass06 {

    public void method1(int a) {
        System.out.println(a);
        a = 88;
    }

    public void method2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        arr[0] = 11;
        System.out.println(Arrays.toString(arr));

    }
}
