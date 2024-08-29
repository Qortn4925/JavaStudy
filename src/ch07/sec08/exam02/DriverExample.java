package ch07.sec08.exam02;

import ch06.sec13.exam03.package1.B;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();


        //vehicle 은 run() 이라는 메소드를 가짐
        // bus, taxi에   run() 메소드를 오버라이딩 해서 각자의 그걸로 만들었고

        // driver 객체는 vehicle을 매개변수로 하는 메소드를 만들어  탈것이 관리하는 메소드가 된거

        //  매개변수로 vehicle의 자손인 , 택시 , 버스가 들어와도 형변환 되어서 > 오버라이딩 된 메소드가 출력
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
