package ch08.sec11.exam02;

import ch07.exercise.S11.MainActivity;
import ch08.sec10.exam01.B;
import ch08.sec10.exam01.D;

public class DriverExample {

    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle v1 = new Bus();
        Vehicle v2 = new Taxi();
        //클래스를 직접 생성해서 집어넣은 경우와
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

        driver.drive(v1);
        driver.drive(v2);
        
        //exam01 패키지에 있는 방식은
        //Car 라는 클래스가 필드값으로 (구현클래스 kumho, hankook), 생성해서 돌렸고
        // 이번엔 예제에서 직접  구현클래스를 생성하고 그 값을 >  driver객체의. drive()안에 넣어서 실현
        //생성과정을 사용자가 하게 할거냐 , 실행만 결정하게 할거냐 그건가 ?
        // 사용자가 하는경우는 > 정보나 , 그런걸 직접 입력해야하는거고 , 실행 결정은 . 나머지는 다 정해지고 , 할지 말지만 정하는거고 ?

    }


}
