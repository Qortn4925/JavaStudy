package ch08.sec12;

import ch08.sec10.exam01.B;

public class InstanceExample {
    public static void main(String[] args) {

        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);


    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
    
}
