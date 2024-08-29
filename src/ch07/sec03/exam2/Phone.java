package ch07.sec03.exam2;

import ch06.sec12.hankook.SnowTire;

public class Phone {
    private String model;
    private String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("phone 객체 , 필드 값을 가지는");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
