package ch06.lecture.p04Constructor.C01Constructor;

public class C04This {
    public static void main(String[] args) {
        MyClass04 o = new MyClass04(33, "lee");
        System.out.println(o.age);
        System.out.println(o.name);

        MyClass04 o2 = new MyClass04(22, "assd");
        System.out.println(o2.age);
        System.out.println(o2.name);
    }
}

class MyClass04 {
    int age;
    String name;


    //this : 이 클래스로 만들어진 객체의 참조값. 위에서 o를 대신?
    MyClass04(int age, String name) {

        this.age = age;
        this.name = name;
    }
}
