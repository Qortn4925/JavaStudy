package ch15.lecture.p06map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
    public static void main(String[] args) {

        // map : entry(key, value) 들을 저장 , 키  , 값
        // 같은 key를 가진 entry를 저장할 수 없음   즉 하나임

        Map<String, String> map = new HashMap<>();

        // entry 추가
        //put
        map.put("java", "자바");
        map.put("react", "리액트");
        map.put("vue", "뷰");
        map.put("spring", "스프링");

        //entry 삭제
        //remove
        map.remove("react");
        System.out.println(map.size());
        
        //entry 탐색
        //size , containskey
        System.out.println(map.size());
        boolean b1 = map.containsKey("java");
        System.out.println("b1 = " + b1);
        // containsvalue
        boolean b2 = map.containsValue("리액트");
        boolean b3 = map.containsValue("파이썬");
        System.out.println("b3 = " + b3);
        System.out.println("b3 = " + b2);

        //전체탐색


    }

}
