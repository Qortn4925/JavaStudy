package ch08.sec05.exam01;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 킵니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOULUME) {
            this.volume = RemoteControl.MAX_VOULUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("volume = " + volume);
    }

}
