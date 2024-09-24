package ch12.lecture.p06annotation;

public class C05Element {

    @MyAnnotation
    public void method() {

    }
}


@interface MyAnnotation {

    // element ,  (attribute)
    String name();

    int age();
}

