package ch06.lecture.p03method;

public class C11Return {
    public static void main(String[] args) {

    }
}

class MyClass11 {

    public void method1() {

    }

    //메소드에 리턴타입이 있는 경우
    // 꼭 코드 실행중 리턴문이 실행되도록 해야함
    public int method2() {
        System.out.println("인트");

        boolean a = true;

        if (a) {
            return 3;
        }
        return 4;
    }
}
