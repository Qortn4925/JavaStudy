package ch07.sec04.exam2;

import java.sql.SQLOutput;

public class SupersonicAirplane extends Ariplane {

    public static final int NORMAL = 1;
    public static final int SUPER_SONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPER_SONIC) {
            System.out.println("초고속 비행");
        } else {
            super.fly();
        }
        
    }
}
