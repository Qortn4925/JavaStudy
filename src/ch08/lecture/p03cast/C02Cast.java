package ch08.lecture.p03cast;

public class C02Cast {
    public static void main(String[] args) {
        MyInterface2 o = new MyClass21();
        if (o instanceof MyClass21) {
            //만약 o가 가리키는 객체가 MyClass21 x타입이면
            MyClass21 a = (MyClass21) o;
            System.out.println("1번 실행");
        }

        if (o instanceof MyClass22) {
            // 만약 o 객체가  22 타입이면
            MyClass22 b = (MyClass22) o; //  >> 오류 , 21 > o에 포함 <   22에는 포함 x
            //7번째 줄에서 오류 발생해서 다음 코드 실행불가
            System.out.println("2번 실행");
        }


        System.out.println("다음 코드");

    }


}

// @formatter:off
interface MyInterface2 {

}

class MyClass21 implements  MyInterface2{}

class MyClass22 implements  MyInterface2{}