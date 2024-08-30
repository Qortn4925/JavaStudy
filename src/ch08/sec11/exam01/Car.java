package ch08.sec11.exam01;

public class Car {
    //Car 라는 클래스에  Tire인터페이스 객체를 만들고
    // 그 인터페이스의 구현 클래스는  금호 , 한국이니까
    // 두 개를 다 만들어 봐서 .  추상 메소드를 실현 하는거임
    Tire tire = new HankookTire();
    Tire tire2 = new KumhoTire();


    void run() {
        tire.roll();
        tire2.roll();
    }
}
