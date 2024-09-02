package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle ve = new Bus();

        ve.run();
        //ve.checkFare();

        Bus bus = (Bus) ve;
        bus.run();
        bus.checkFare();

    }
}
