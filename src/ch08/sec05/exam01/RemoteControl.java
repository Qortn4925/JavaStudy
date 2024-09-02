package ch08.sec05.exam01;

public interface RemoteControl {

    int MAX_VOULUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {

        if (mute) {
            System.out.println("무음처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery() {
        System.out.println("리모컨 건전지를 교환합니다");
    }
}
