package ch12.lecture.p06annotation;

public class C06Element {
    @MyAnnotation6(name = "hello", age = 30)
    int a;

    // 아래와 같이 선언하면 , name 배열을 만들수 있어서 , 선언하면 되는데 , 하나면 중괄호 생략 가능 > 그래도 배열로 인식
    @MyAnnotation6(name = {"world", "java"}, age = 40)
    int b;
}


@interface MyAnnotation6 {

    String[] name();

    int age();
}
