package ch06.lecture.p04Constructor.C01Constructor;

public class C02Constructor {

    public static void main(String[] args) {
        MyClass02 my = new MyClass02();
        System.out.println(my.age);
        System.out.println(my.name);
    }
}

class MyClass02 {
    int age;
    String name;


    MyClass02() {
        age = 1;
        name = "guest";
    }
}
