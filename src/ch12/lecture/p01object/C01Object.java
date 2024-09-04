package ch12.lecture.p01object;

public class C01Object {
    public static void main(String[] args) {
        //object는 모든 클래스의 상위 클래스
        // -> object의 메소드는 모든 클래스가 가짐

        // 주요 메소드
        //eqauls, hashcode, tostring
        MyClass1 o = new MyClass1();
        Object a = o;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(o));

        a.equals(null);
        a.hashCode();
        a.toString();
        
    }
}

// 직접 정의한 클래스도 Object를 부모 클래스로 둠
// extends Objects 생략 되어 있음
class MyClass1 {

}
