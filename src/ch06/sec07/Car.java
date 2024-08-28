package ch06.sec07;

public class Car {
    String company = "현대";
    String model;
    String color;
    int maxSpeed;

    // alt ++ insert 를 누르면 생성자 단축기임


    Car(String model) {
        //밑에 인수 3개 가지는 파라미터 생성자 호출해서 값을 집어 넣은거임
        //그래서 실제 사용할때 생성자에 파라미터에 넣지 않은 값도 들어감 이 메소드가 실행되면서 다른 생성자를 불르기때문에
        this(model, "은색");
    }


    Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
