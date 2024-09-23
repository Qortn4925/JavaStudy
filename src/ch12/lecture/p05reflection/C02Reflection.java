package ch12.lecture.p05reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C02Reflection {
    public static void main(String[] args) {

        Class o1 = MyClass2.class;


        //declared >>  상속 x 그냥 자기 클래스
        Field[] declaredFields = o1.getDeclaredFields();// 필드 정보를 가져오는 메소드 당연히 상ㅇ 가능
        Constructor[] cons = o1.getDeclaredConstructors();// 생성자 정보 얻기
        Method[] methods = o1.getDeclaredMethods();//메소드 정보 얻기

        // 6,2,3
        System.out.println("methods = " + methods);
        System.out.println("cons = " + cons);
        System.out.println("declaredFields = " + declaredFields);

    }

    @Override
    public String toString() {
        return "C02Reflection{}";
    }
    
}


class MyClass2 {
    // 필드
    private int age;
    private String name;
    private String email;
    // 생성자

    public MyClass2() {

    }

    public MyClass2(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }


    // 메소드

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
