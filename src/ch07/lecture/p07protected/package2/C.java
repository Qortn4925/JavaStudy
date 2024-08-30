package ch07.lecture.p07protected.package2;

import ch07.lecture.p07protected.package1.A;

public class C {

    public void someMethod() {
        A a = new A();
        a.publicMethod();
//        a.packagePrivateMethod(); 실행 불가 
//        a.protectedMethod();   실행 불가
    }
}
