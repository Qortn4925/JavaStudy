package ch07.lecture.p03polymorphism;

import ch06.sec13.exam03.package2.C;

public class C01Polymorphism {
    public static void main(String[] args) {
        Child011 o1 = new Child011();

        Parent01 o2 = o1; // ok >> Child011();
        Parent01 o3 = new Child011();

        Childe012 o4 = new Childe012();
        
        Parent01 o5 = new Childe012();

    }
}


class Parent01 {
}

class Child011 extends Parent01 {
}

class Childe012 extends Parent01 {

}
