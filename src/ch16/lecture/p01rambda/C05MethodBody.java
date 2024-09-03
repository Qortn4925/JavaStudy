package ch16.lecture.p01rambda;

public class C05MethodBody {
    public static void main(String[] args) {

        //메소드 몸통  1줄 아니면
        // {} 붙여야 함

        MyInterface5 o = () -> {
            System.out.println("명령문1");
            System.out.println("명령문2");
        };
        o.some();
        MyInterface5 p = () -> {
            System.out.println("한 줄");
        };
        p.some();

        MyInterface5 q = () -> System.out.println("한 줄이라 중롹로 안함");
        q.some();
    }
}


@FunctionalInterface
interface MyInterface5 {
    void some();
}
