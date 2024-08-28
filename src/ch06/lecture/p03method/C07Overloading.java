package ch06.lecture.p03method;

public class C07Overloading {
    public static void main(String[] args) {

        MyClass07 m7 = new MyClass07();
        m7.method1();
        m7.method2(10);

        m7.method(10, "1");
        m7.method("우루루루", 5);
    }
}

class MyClass07 {
    //아래에는 같은 이름의 메소드가 두개가 있는데 . >  어떻게 구별하냐 , 파라미터의 데이터형 , 갯수 , 순서로 구분
    // 와 같은 요소를 다 구분해서 알아서 찾아온다
    public void method1() {

        System.out.println("실행문들");
    }

    public void method1(int b) {
        System.out.println("method1 > int 파라미터");
    }

    public void method(int a, String b) {
        System.out.println("method  int , string");
    }

    public void method(String a, int b) {
        System.out.println("metohd  string , int");
    }

    public void method2(int a) {
        System.out.println("메소드 2 실행");
    }

}