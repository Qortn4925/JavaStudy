package ch06.lecture.p07package;

import ch06.lecture.p07package.package1.MyClass01;

public class C03Package {
    public static void main(String[] args) {
//        ch06.lecture.p07package.package1.MyClass01 o1
//                = new ch06.lecture.p07package.package1.MyClass01();
        MyClass01 o1 = new MyClass01();  // 위에거랑 같은데 위에서 임포트 해줘서 가능
        System.out.println("o1 = " + o1);
    }
}
