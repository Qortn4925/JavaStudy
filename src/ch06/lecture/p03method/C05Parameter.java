package ch06.lecture.p03method;

public class C05Parameter {
    public static void main(String[] args) {


        MyClass05 m5 = new MyClass05();

        // 파라미터에 값 넣기
        int x = 10;
        m5.method2(15);
        m5.method2(x);
        m5.method3(15, "기기긱");
        

    }


}

class MyClass05 {
    //(): >> 파라미터,argument (parameter, 인자, 매개변수)
    // 타입 파라미텀명 , 타입 파라미터명...

    public void method1(int age, String name, int[] scores, String[] studentNames) {
        //변수 선언 , 값 대입 , 제어문 , 연산식
        //각 파라티터는 그 순서대로 넣어줘야함
    }

    public void method2(int age) {
        //파라미터는 실행 당시 안에 값을 넣는게 당연하기에 > 굳이 인자값을 초기화 하지 않아도 실행

        System.out.println("method2  > int age " + age);

    }

    public void method3(int age, String name) {
        System.out.println(STR."\{age}세 \{name}님");
    }

}
