package ch06.lecture.p02field;

import ch06.lecture.p01class.MyClass02;

public class C01Field {
    public static void main(String[] args) {

        //객체명. 필드명 
        MyClass01 myClass01 = new MyClass01();
        System.out.println(myClass01.age);
        MyClass01 myClass02 = new MyClass01();

        System.out.println(myClass02.name);
        myClass01.age = 11;
        System.out.println("myClass01 = " + myClass01.age);
        System.out.println("myClass02.age = " + myClass02.age);
    }
}

class MyClass01 {
    //field: 각 객체가 가질 수 있는 값 목록 ~ 생성시 바로 가짐
    int age = 5;

    String name = "모니터";


}
