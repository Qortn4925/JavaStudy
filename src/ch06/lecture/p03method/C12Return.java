package ch06.lecture.p03method;

public class C12Return {
    public static void main(String[] args) {
        MyClass12 m = new MyClass12();

        //return 값은 어디로 가는가 ?
        // m.method1() > 이 3이 되어버림
        int b = 3;
        int a = m.method1();

    }
}

class MyClass12 {

    public int method1() {
        return 3;
    }
}
