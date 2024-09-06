package ch13.lecture.p03polymorphism;

public class C03BoundedTypeParameter {
    public static void main(String[] args) {
        var o1 = new MyClass3<Integer>();
        o1.method(33);
        var o2 = new MyClass3<Double>();
        o2.method(3.14);
        var o3 = new MyClass3<Long>();
        o3.method(15L);

        // number 또는 넘버 밑에 자식들
    }
}

class MyClass3<T extends Number> {

    void method(T param) {
        System.out.println(param.doubleValue());
        System.out.println(param.intValue());
        System.out.println(param.longValue());
    }
}
