package ch12.lecture.p02wrapper;

public class C01Wrapper {
    public static void main(String[] args) {
        int a = 1;
        // 옛날 코드    > b 저장공간 , 인스턴스 3   참조값의 정보가 b에 저장
        Integer b = new Integer(3);

        //기본 타입 a 가 가진 값을
        // 참조 타입 Integer 가 c 로 변환( 직접 boxing)
        Integer c = Integer.valueOf(a);

        //기본타입 a를 참조타입 d로 변환(자동  auto boxing)
        Integer d = a;

        //참조 타입
        Long e = 5L;   //auto boxing 기본타입 long을  참조타입으로


        // 기본타입
        long f = 5;
        Double g = 3.14;

        boolean h = true;
        Object i = 9.1234;
    }
}
