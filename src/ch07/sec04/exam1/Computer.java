package ch07.sec04.exam1;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer.areaCircle 이 실행 ");
        return Math.PI * r * r;

    }
    

}

