package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // 참조 값을 복사해서 넘어가기 때문에   같음
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
        System.out.println();

        System.out.println(System.identityHashCode(a1));
        System.out.println(System.identityHashCode(a2));
        System.out.println(System.identityHashCode(a3));
        System.out.println(System.identityHashCode(a4));

        System.out.println();

        System.out.println(System.identityHashCode(b1));    // d,
        System.out.println(System.identityHashCode(c1));    // e

        //위에서 아래로 는 가능 하지만
        // 같은 라인에서 같은 라인은 안되는게 당연한 예시;
        // 아래에서 위는 굳이 호출할 필요없이 B b =new B(); 하면 A의 것도 되니까 할 필요가 없다

//        B b2 = c;
//
//        C c2 = b;
//
//        D d2 = e;
//
//        E e2 = d;
    }
}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {

}

class E extends C {
}