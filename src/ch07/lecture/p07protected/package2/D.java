package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class D extends A {

    // public 
    //protected
    //package-private


    public void someMethod() {
        publicMethod();
//        packagePrivateMethod();
        protectedMethod();// 다른 , 상속이라 가능
    }
}

