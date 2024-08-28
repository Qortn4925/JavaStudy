package ch06.lecture.p04Constructor.C01Constructor;

public class C08ThisConstructor {
    public static void main(String[] args) {

    }
}

class MyClass08 {
    int age;
    int id;
    String name;
    String address;

    public MyClass08(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public MyClass08(int id, int age, String name, String address) {
        // id~ name 까지 둘이  겹침. 코드를 줄이고 싶은데
        this(age, id, name);
//        this.id = id;
//        this.age = age;
//        this.name = name;
        this.address = address;
    }
}


