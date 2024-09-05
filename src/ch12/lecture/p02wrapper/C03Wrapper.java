package ch12.lecture.p02wrapper;

public class C03Wrapper {
    public static void main(String[] args) {

        int a = 3000;
        int b = 3000;

        System.out.println(a == b);

        Integer c = a;
        Integer d = b;

        // 참조라 당연한 이야기
        System.out.println(c == d);

        //참조타입 비교는 equals
        System.out.println(c.equals(d));
        //
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        //주소값
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
