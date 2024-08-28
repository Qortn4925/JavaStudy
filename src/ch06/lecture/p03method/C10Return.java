package ch06.lecture.p03method;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C10Return {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    //return 타입 :  void ,or 데이터 타입
    public void method1() {

        //return 키워드의 존재 여부 상관 x
    }
    // void 외: return이  실행되;도록 코드 작성
    // return:
    //1.메소드 종료
    //2. 오른쪽 값을 호출한 곳으로 반한

    public int method2() {

        return 3;
    }

    public String method3() {

        return "흥";
    }

    public int[] method4() {

        return new int[]{3, 4};
    }

    public PrintStream method5() throws FileNotFoundException {
        return new PrintStream("");
    }

}
