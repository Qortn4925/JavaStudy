package ch06.lecture.p06final;

public class C05StaticField {
    public static void main(String[] args) {
        System.out.println(MyClass05.num);
//        MyClass05.num=0; // xx

    }
}

class MyClass05 {
    //한 번 정해지면 변경되지 않을 것에 주로 사용
    // pi같은거  정해진거
    // final static 작성 관습 = UPPER_SANKE_CASE
    // 
    final static int num = 5;
    //NUM , PI , INTMAX > 이런식으로 작성해야함
    final static double pi = 3.141592;


}
