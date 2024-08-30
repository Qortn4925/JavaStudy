package ch08.exercise.sol6;

import ch08.sec10.exam01.C;
import ch08.sec10.exam01.D;

public class SoundableExample {

    public static void main(String[] args) {

        printSound(new Cat());
        printSound(new Dog());
    }

    static public void printSound(Soundable soundable) {

        System.out.println(soundable.sound());
        
    }
}
