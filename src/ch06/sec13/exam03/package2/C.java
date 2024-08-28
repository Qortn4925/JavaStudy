package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1;  // > 접근 x 디폴트는 같은 패키지 안에서
//        a.field3=1; // 접근 x private

        a.method1();
//        a.method2(); // > 접근x  디폴트는 같은 패키지 안에서
//        a.method3();
    }
}

