package ch06.sec06;

public class CarExample1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();

        //필드 초기값
        System.out.println("모델명 =" + c1.model);
        System.out.println("속도 =" + c1.speed);
        System.out.println("시동여부 = " + c1.start);
    }
}


