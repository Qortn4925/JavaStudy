package ch03.lecture.p05priortiy;

public class C01Priority {
    public static void main(String[] args) {
        // 연산자 우선순위를 크게 외우려하지말고 헷갈리면 괄호 써서 그냥 하자~~
        //책 107

        int a = 3 * 5 * 2;
        System.out.println("a = " + a);


        // () 로 먼저 연산되는부분을  감싸기
        int b = 3 + (5 * 2);
        System.out.println("b = " + b);
        int c = (3 + 5) * 2;
        System.out.println("c = " + c);
        
    }
}
