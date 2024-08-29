package ch07.lecture.p03polymorphism;

public class C04Polymorphism {
    public static void main(String[] args) {
        Child041 c41 = new Child041();

        c41.method41();
        c41.method1();

        Child042 c42 = new Child042();
        c42.method42();
        c42.method1();

        Parent04 p04 = c41; //  c41의 참조값
        Parent04 p05 = c42; // c42의 참조값

        p04.method1();
//        p04.method41():    //

        p05.method1();
//        p05.method42():   // 접근 x
    }

}

class Parent04 {
    public void method1() {
        System.out.println("Parent04.method1");
    }
}

class Child041 extends Parent04 {
    // method 1
    public void method41() {
        System.out.println("Child041.method41");
    }
}

class Child042 extends Parent04 {
    // method 2

    public void method42() {
        System.out.println("Child042.method42");
    }
}
