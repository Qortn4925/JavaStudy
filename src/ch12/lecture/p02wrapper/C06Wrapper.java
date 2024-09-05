package ch12.lecture.p02wrapper;

public class C06Wrapper {
    public static void main(String[] args) {
        // Wrapper class 의
        // 유용한 필드와 메소드 소개
        // int의 가장 큰 ㄱ밧
        System.out.println(Integer.MAX_VALUE);
        //int의 가장 작은ㄱ밧
        System.out.println(Integer.MIN_VALUE);

        // Nan, infinity 확인
        double a = 5.0 / 0.0; // Infinity

        System.out.println(Double.isInfinite(a));

        double b = 5.0 % 0.0; //Nan
        System.out.println(Double.isNaN(b));

        //compare   :  비교 메소드
        // 리턴값 : 같으면 0 ,작으면 으수 , 크면 양수
        Integer c = 5000;
        Integer d = 7000;
        System.out.println(c <= d);

        // c가 더 작으니까 음수
        System.out.println(c.compareTo(d));
        // d가 기준이니까 양수
        System.out.println(d.compareTo(c));

        Double e = 3.14;
        Double f = 7.1234;
        System.out.println(e == f);
        System.out.println(e.compareTo(f));
        System.out.println(f.compareTo(e));

    }
}
