package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;

public class C01HashSet {
    public static void main(String[] args) {
        //set: 중복된 요소를 허용하지 않음
        Set<String> set = new HashSet<>();

        //add 추가
        set.add("java");
        set.add("spring");
        set.add("html");

        //삭제 > 연산 결과를 boolean
        boolean b3 = set.remove("html");
        
        System.out.println(set);
        set.remove("react");// 변경 x
        //contains 있느ㅜㄴ지 확인
        boolean b1 = set.contains("css"); //false
        boolean b2 = set.contains("html");

        //size 요소의 개수
        System.out.println(set.size());
        //전체 탐색

    }
}
