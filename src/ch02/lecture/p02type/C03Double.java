package ch02.lecture.p02type;

import java.math.BigDecimal;

public class C03Double {
    public static void main(String[] args) {
        double a= 0.1;
        double b = 0.2;
        double c = a+b;

         // 출력 결과 0.3 이 아닌  근사값으로 들어감
        System.out.println("c="+c);

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal f = new BigDecimal("0.2");
        BigDecimal G = d.add(f);
        System.out.println("G = " + G);


    }
}
