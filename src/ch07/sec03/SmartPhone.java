package ch07.sec03;

public class SmartPhone extends Phone {

    public SmartPhone(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("매개변수로 model,color 가지는 생성자 생성");
    }
    
}
