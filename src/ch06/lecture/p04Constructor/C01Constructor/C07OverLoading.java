package ch06.lecture.p04Constructor.C01Constructor;

public class C07OverLoading {
    public static void main(String[] args) {
        MyClass07 o = new MyClass07(5, 3, "김", "비밀");
        MyClass07 p = new MyClass07(1, 5);
        MyClass07 q = new MyClass07("김", "서울");
    }
}

class MyClass07 {
    int id;
    int age;
    String name;
    String address;

    MyClass07(int id, int age, String name, String address) {

        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    MyClass07(int id, int age) {
        this.id = id;
        this.age = age;
    }

    MyClass07(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
