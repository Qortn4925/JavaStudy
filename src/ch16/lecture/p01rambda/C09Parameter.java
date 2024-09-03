package ch16.lecture.p01rambda;

public class C09Parameter {
    public static void main(String[] args) {

        MyInterface9 o = (int x) -> System.out.println(x);

        o.methdo(1111);

        //파라미터 타입 생략 가능
        MyInterface9 a = (x -> System.out.println(x + x));
        a.methdo(10);

        //파라미터가 하나면 () 둥근괄호 생략 가능
        MyInterface9 c = z -> System.out.println(z * 2);
        c.methdo(3);

    }
}

interface MyInterface9 {
    void methdo(int x);
}
