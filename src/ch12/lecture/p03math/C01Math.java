package ch12.lecture.p03math;

public class C01Math {
    public static void main(String[] args) {
        //random : 0.0  <= 임의의값 리턴 <1.0
        double r = Math.random();

        System.out.println("r = " + r);

        double v = Math.abs(-5.132);
        System.out.println("v = " + v);
        double a = Math.abs(7.12312);
        System.out.println("a = " + a);


        //round : 반올림
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.5));

        //floor: 버림
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(3.9));

        //ceil : 올림
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(3.9));

        // max : 큰 값 리턴
        System.out.println(Math.max(6, 3));
        //min : 작은 값 리턴
        System.out.println(Math.min(3.14, 2.91));
    }
}
