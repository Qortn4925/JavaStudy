package ch12.lecture.p06annotation;

import java.lang.annotation.Annotation;

public class C04Annotation {

    public static void main(String[] args) {
        Class m4 = MyClass4.class;
        Annotation[] declaredAnnotations = m4.getDeclaredAnnotations();
        System.out.println(declaredAnnotations.length);

    }
}

@MyAnnotation4
class MyClass4 {

}

// policy.> runtime= 실행시간 까지, class 컴파일 될때 까지(기본값), source 컴파일 전 까지
//@Retention(RetentionPolicy.RUNTIME) > 1
@interface MyAnnotation4 {

}
