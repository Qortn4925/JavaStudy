package ch02.lecture.p03String;

public class C05Parsing {
    public static void main(String[] args) {
        String a = "33";

        //문자열을 int로 변환(파싱)
        int a1 = Integer.parseInt(a);

        int b = 2 * a1; // >> 66을 만들고 싶음 . 문자열 곱 안됨 , 인트형으로 바꾸고
        System.out.println("b = " + b);
        String c = "3.14";

        // 문자열을 double 로 변환 ( parsing)
        double c1 = Double.parseDouble(c);
        double d = 5 + c1;  // > 8.14 
        System.out.println("d = " + d);

    }
}
