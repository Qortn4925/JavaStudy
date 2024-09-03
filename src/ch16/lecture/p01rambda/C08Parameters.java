package ch16.lecture.p01rambda;

public class C08Parameters {

    public static void main(String[] args) {
        MyInterface8 a = (int x, int y, int z) -> System.out.println("셋");

        a.some(2, 3, 4);

        //파라미터 목록의 타입 생략 가능 ( 선호)
        MyInterface8 b = (x, y, z) -> {
            System.out.println("타입 생략");
        };
        b.some(1, 2, 3);

        MyInterface8 c = new MyInterface8() {
            @Override
            public void some(int a, int b, int c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        };
        c.some(10, 20, 30);

        MyInterface8 d = (q, w, e) -> System.out.println(q + w + e);
        d.some(11, 22, 33);
        
    }

}

@FunctionalInterface
interface MyInterface8 {
    void some(int x, int y, int z);
}
