package ch12.lecture.p06annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class C01Annotation {
    public static void main(String[] args) {
        // Annotation: 컴파일러 , 프레임워크 주석 등에 부가정보를 알려주는 주석

        Class c = MyClass1.class;
        Annotation[] annotations = c.getAnnotations();
        System.out.println(annotations.length);


        for (Annotation annotation : annotations) {
            Class a = annotation.annotationType();
            if (a.equals(MyAnnotation1.class)) {
                System.out.println(" 이 이노테이션이 있다면 특정 업무를 할 것 ");
            }
        }
    }
}

@MyAnnotation1  // 부가정보 ,
class MyClass1 {

}

// annotation 정의
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {


}