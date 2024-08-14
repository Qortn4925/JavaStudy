package ch02.lecture.p02type;

public class C04Boolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a) {
            System.out.println("참");
        } else {
            System.out.println(" a 거짓");
        }
        if (b) {
            System.out.println("참 실행 2");
        } else {
            System.out.println(" b 거짓");
        }
    }
}
