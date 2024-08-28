package ch06.sec10;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("12345", "감자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "뭘봐";
        System.out.println(k1.name);
        // k1.ssn="ㅇㄴㅁㅇㅁㄴㅇ"; >> 오류 발생

    }

}
