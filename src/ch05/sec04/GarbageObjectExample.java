package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";           //자동차의 정보를 가지고 있는 인스턴스 생성
        String kind2 = kind1;             //자동차의 정보를 저장하고있는 주소값을 kind2로 넘겨줌
        System.out.println(kind1 == kind2); // 같은 곳을 가리킴
        kind1 = new String("abc");                     //abc로 덮음
        System.out.println(kind2);
        System.out.println(kind2 == kind1);
    }
}
