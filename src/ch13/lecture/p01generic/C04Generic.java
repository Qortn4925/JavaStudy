package ch13.lecture.p01generic;

public class C04Generic {
    public static void main(String[] args) {
        MyClass4<String> o1 = new MyClass4<>();
        MyClass4<Integer> o2 = new MyClass4<>();

        int i = 3;
        var j = 5;

        //오른쪽 보고 왼쪽 유추 가능하니까  , VAR 로 작성ㅎ도 상관 없음
        var o3 = new MyClass4<String>();
        var o4 = new MyClass4<Integer>();
    }
}

class MyClass4<T> {

}
