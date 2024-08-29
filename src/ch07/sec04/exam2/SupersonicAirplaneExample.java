package ch07.sec04.exam2;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {

        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();  // 아마 노말 값이니까 그냥 비행
        //flymode > 벼녕 하고 뜨니까 조낸 빠름


        sa.flyMode = SupersonicAirplane.SUPER_SONIC;
        sa.fly();

        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();

        sa.land();
    }
}
