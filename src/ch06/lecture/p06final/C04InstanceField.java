package ch06.lecture.p06final;

public class C04InstanceField {

}

class MyClass04 {
    //fianl instance field는 생성자에서 또는 직접 초기화해야한다
    int a;
    final int b = 3;
    final int c;

    MyClass04() {
        c = 3;
    }

    MyClass04(String a) {
        c = 33;
    }

}
