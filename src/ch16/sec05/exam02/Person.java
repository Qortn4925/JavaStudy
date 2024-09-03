package ch16.sec05.exam02;

import ch16.sec05.Computer;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "홍길";
        String b = "동동";

        int result = comparable.compare(a, b);

        if (result < 0) {
            System.out.println(a + "은" + b + "보다 ㅇ앞에");
        } else if (result == 0) {
            System.out.println(a + "은" + b + "같음");

        } else
            System.out.println(a + "은" + b + "보다 뒤에");

    }
}
