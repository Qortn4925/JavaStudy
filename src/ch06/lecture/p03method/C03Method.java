package ch06.lecture.p03method;

public class C03Method {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.name = "김용수";

        MyClass03 b = new MyClass03();
        b.name = "홀란";
        a.printName();
        b.printName();
    }

}

class MyClass03 {
    String name;

    public void printName() {
        System.out.println(name + "입니다");
    }
}
