package ch13.lecture.p03polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class C01BoundedTypeParameter {
    public static void main(String[] args) {
        var o1 = new MyClass1<String>();
        var o2 = new MyClass1<Integer>();
        var o3 = new MyClass1<Scanner>();

        o1.method("java");
        o2.method(535);
        o3.method(new Scanner(""));

    }
}

class MyClass1<T> {

    void method(T param) {
        System.out.println(param instanceof Object);  // 뭐가 오든 object는 항상 트루 임
        // + object 메소드는 다 사용가능 
        System.out.println("parma" + param.toString());
        System.out.println("param" + param.equals(null));
        System.out.println("param = " + param.hashCode());
        //형변환 해서 사용
        if (param instanceof String s) {
            int length = s.length();
            System.out.println("length = " + length);
        }

    }
}
