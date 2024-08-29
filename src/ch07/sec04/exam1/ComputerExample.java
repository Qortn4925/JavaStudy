package ch07.sec04.exam1;

import ch06.sec13.exam03.package2.C;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Computer C = new Computer();
        int r = 10;


        // 오버라이딩 areaCircle
        System.out.println(C.areaCircle(r));
        System.out.println();

        //d원래 areaCircle
        System.out.println(c1.areaCircle(r));
    }
}
