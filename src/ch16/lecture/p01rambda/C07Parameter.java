package ch16.lecture.p01rambda;

public class C07Parameter {
    public static void main(String[] args) {
        MyIntreface7 o = () -> {
            System.out.println("코드");
        };
        o.some();
    }
}


@FunctionalInterface
interface MyIntreface7 {

    void some();
}

