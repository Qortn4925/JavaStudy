package ch03.lecture.p04logical;

public class C04ShortCircuit {
    public static void main(String[] args) {
        boolean a = false && false;
        int b = 5;
        int c = 5;

        boolean d = ((b++) < 0) && ((c++) < 0); // shortcircuit 연산 때문에  앞에거에서 논리 결과가 결정되어 뒤에 ++가 안 더해짐


        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int e = 5;
        int f = 5;

        boolean g = ((b++) < 0) & ((c++) < 0); // & 하나면 shortcircuit연산을 안함
    }
}
