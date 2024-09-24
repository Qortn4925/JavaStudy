package ch12.lecture.p06annotation;

public class C07Element {

    // 속성을 만들어 줬지만 사용 X >  디폴트 값으로
    @MyAnnotation7
    int a;


    // 위에랑 같은 코드다
    @MyAnnotation7(name = "son", age = 1)
    int b;
}


@interface MyAnnotation7 {

    String name() default "son";

    int age() default 1;
}
