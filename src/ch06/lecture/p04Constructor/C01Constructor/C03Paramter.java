package ch06.lecture.p04Constructor.C01Constructor;

public class C03Paramter {

    public static void main(String[] args) {
        MyClass03 m = new MyClass03(5, "10");

    }
}

class MyClass03 {

    int age;
    String name;

    MyClass03(int age, String name
    ) {
        this.age = age;
        this.name = name;

    }
}
