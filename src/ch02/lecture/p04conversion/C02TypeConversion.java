package ch02.lecture.p04conversion;

public class C02TypeConversion {
    public static void main(String[] args) {
        //정수 <> 실수
        
        float a = 3.14f;
        double b = a;   // > 자동 형변환

        double c = 3.14;
        float d = (float) c;
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
