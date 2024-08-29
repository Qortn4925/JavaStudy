package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("갤럭시", "은색");

        // 스마트폰이 상속 받은 메소드들
        phone.bell();
        phone.sendVoice("여보세요");
        phone.receiveVoice("안녕하세요 저는 홍길동입니다.");
        phone.sendVoice("반갑습니다.");
        phone.hangUp();

        // 스마트폰에 있는 메소드
        phone.setWifi(true);
        phone.internet();
    }
}