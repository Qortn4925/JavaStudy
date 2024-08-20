package ch03.lecture.p01arithmethic;

public class C06Double {
    public static void main(String[] args) {
        //Infinity: 양의 무한대
        // -Infinity : 음의 무한대

        //정수 연산시 0으로 나눌수 없음
//        System.out.println(30 / 0); // 오류  0으로 나눔

        //실수 연산시 0으로 나누면 >> Infinity
        System.out.println(3.0 / 0.0);

        //NaN ( Not a Number)
        System.out.println(3.0 % 0);

        double b = 3.0 % 0;
        b = b * 1;
        System.out.println("b = " + b);

        //Infinity 인지 확인
//        System.out.println(Double.isInfinite(Infinity));
        System.out.println(Double.isInfinite(3.0));

        //Nan확인
        System.out.println(Double.isNaN(b));
        System.out.println(Double.isNaN(3.0));
        // Finity 인지  >> isFinity

    }
}
