package ch14.sec06.exam01;

public class SynchronizedExample {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        User1Thread t1 = new User1Thread();
        t1.setCalculator(cal);
        t1.start();

        User2Thread t2 = new User2Thread();
        t2.setCalculator(cal);
        t2.start();


    }
}
