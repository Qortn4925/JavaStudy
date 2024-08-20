package ch03.lecture.p07ternary;

public class C01Ternary {
    public static void main(String[] args) {
        // 삼항 연산자 ( 조건연산자)
        // a ?b:c    a> true >> b실행   a >> false >>c 실행

        int a = true ? 5 : 3;
        System.out.println("a = " + a);
        int b = false ? 55 : 33;
        System.out.println("b = " + b);
        
    }
}
