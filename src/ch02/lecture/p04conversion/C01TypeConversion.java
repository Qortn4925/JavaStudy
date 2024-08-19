package ch02.lecture.p04conversion;

public class C01TypeConversion {
    public static void main(String[] args) {
        //type conversion(형 변환)

        //자동 : 작은공간의값 >> 큰 공간
        //강제 : 큰공간의값 > 작은 공간

        //자동
        // 정수형 사이
        int a = 30000;
        long b = a; //작 > 큰   자동
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        short c = (short) a; // >> 오류 큰 > 작 >  강제로 해줘야함 오류나는거 인지해라
        int d = 21_0000_0000;
        short e = (short) d;

        // 그렇다면 29952라는 값은 어떻게 나왔을까   그냥  비트 단위로 해서 없는영역을 다 지우면 된다.


        System.out.println("e = " + e);

    }


}
