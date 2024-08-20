package ch03.lecture.p04logical;

public class C05ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println((a++) > 0 || (b++) > 0);  //  앞에거만 보고 결론
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int d = 5;
        int f = 5;
        System.out.println((d++) > 0 | (f++) > 0);  //  앞에거만 보고 결론 x  뒤에것도 해서 f 값도 커짐
        System.out.println("d = " + d);
        System.out.println("f = " + f);
    }
    }
}
