package ch06.sec08;

import java.util.Map;

public class CarExample {


    public static void main(String[] args) {
        Car my = new Car();
        my.setGas(5);
        if (my.isLeftGas()) {


            System.out.println("출발");
            my.run();
        }

        System.out.println("gas를 주입하삼");
    }
}
