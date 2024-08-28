package ch06.sec07;

public class CarExample {
    public static void main(String[] args) {


        Car c2 = new Car("자가용");
        System.out.println(c2.company);
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.maxSpeed);

        System.out.println();
        Car c3 = new Car("자가용", "빨강");
        System.out.println(c3.company);
        System.out.println(c3.model);
        System.out.println("색" + c3.color);
        System.out.println(c3.maxSpeed);
        System.out.println();

        Car c4 = new Car("자가용", "빨강", 200);
        System.out.println(c4.company);
        System.out.println(c4.model);
        System.out.println(c4.color);
        System.out.println(c4.maxSpeed);
    }
}
