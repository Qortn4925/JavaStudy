package ch16.sec03;

public class Person {
    public void action1(Workable workable) {
        workable.work("홍길", "프로게이머");
    }

    public void action2(Speakable speakable) {

        speakable.speak("헬로우우");
    }
}
