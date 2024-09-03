package ch16.lecture.p01rambda;

public class C06MethodBody {
    public static void main(String[] args) {
        MyInterface6 o = () -> {

            return 0;
        };
        System.out.println(o.method());

        //한 줄의 명령문이 리턴문이면
        // 중괄호 생략 시 return 키워드도 생략
        MyInterface6 p = () ->
                10;
        System.out.println(p.method());
    }
}

interface MyInterface6 {
    int method();
}
