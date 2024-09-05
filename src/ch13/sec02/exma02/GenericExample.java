package ch13.sec02.exma02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();

        //객체 관리하는 법 같은데
        // 인터페이스 rentable 은 말그대로 빌려주기만 할 클래스로  제네릭은 T
        // 리턴으로 객체를 리턴 해줄거
        // agency에선 리턴할 객체를 구현해주고 
        // 각각 car, home 은 메소드를 가지고 있다
    }
}
