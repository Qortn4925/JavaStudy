package ch06.lecture.p03method;

public class C13Return {
    public static void main(String[] args) {
        MyClass13 m = new MyClass13();
        m.makeDouble(3);

        m.makeTriple("son");
        
    }
}

class MyClass13 {
    public int makeDouble(int a) {
        int b = a * 2;

        return b;
    }

    public String makeTriple(String a) {


        return a + a + a;
    }
}
