package ch06.sec06;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println(c1.maxSpeed);
        System.out.println(c1.model);
        System.out.println(c1.color);

        System.out.println(c1.copany);
        c1.speed = 30;

        System.out.println("c1.speed = " + c1.speed);
    }
}
