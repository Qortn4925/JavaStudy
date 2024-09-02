package ch08.sec05.exam01;

import ch08.sec10.exam01.A;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);
        
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.changeBattery();
    }
}
