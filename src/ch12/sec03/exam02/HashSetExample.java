package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        // s1 , s2 는ㄴ 번호도 이름도 같아서 동등객체 처리  집합에 추가 x


        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        set.add(s1);
        System.out.println("s2 = " + set.size());
        set.add(s2);
        System.out.println("set.size() = " + set.size());

        Student s3 = new Student(2, "홍길동");
        set.add(s3);

        System.out.println("set.size() = " + set.size());
    }
}
