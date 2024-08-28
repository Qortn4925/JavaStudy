package ch06.sec14;

import ch06.sec13.exam03.package2.C;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-2);
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());
        myCar.setSpeed(30);
        System.out.println(myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println(myCar.getSpeed());
    }
}
