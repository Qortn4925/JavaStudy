package ch07.sec10.exam01;

import ch07.sec09.Person;

public abstract class Phone {

    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원ㅇ르 킵니다");
    }

    void turnOff() {

        System.out.println("폰 전원을 끕니다");
    }
}
