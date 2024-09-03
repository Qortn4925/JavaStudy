package ch16.lecture.p01rambda;

public class C01Anonymous {
    public static void main(String[] args) {
        MyInterface1 o = new MyInterface1() {
            @Override
            public void method1() {
                System.out.println("C01Anonymous.method1");
            }

            @Override
            public void method2() {
                System.out.println("C01Anonymous.method2");
            }
        };
    }
}


interface MyInterface1 {
    void method1();

    void method2();
}
