package ch06.lecture.p05static;

public class C02Field {
    public static void main(String[] args) {

        MyClass02.age = 10;
        MyClass02.name = "김";

        System.out.println(" = " + MyClass02.age);
        System.out.println(" = " + MyClass02.name);
    }


}

class MyClass02 {
    //인스턴스를 생성하지 않아도 접근이 가능함.
    static int age;
    static String name;
}
