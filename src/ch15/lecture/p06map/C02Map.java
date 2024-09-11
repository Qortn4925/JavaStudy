package ch15.lecture.p06map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C02Map {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("spring", 1000);
        map.put("react", 3000);
        map.put("java", 2000);
        map.put("vue", 1500);

        //전체 탐색
        // keySet > 리턴이 set임 그래서 set 전체 탐색 방법 사용

        Set<String> keys = map.keySet();
        for (String key : keys) {
            //key를 >set > set을 접근 했고  키를 통해 밸류값 받음
            Integer val = map.get(key);
            System.out.println(key + ":" + val);
        }

        //entrySet 이용
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer val = entry.getValue();
            System.out.println(key + ":" + val);
        }


        //map의 fore each문은 biconsumer 인터페이스 > accept 라는 추상 메소드를 가짐 > 람다
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + " : " + v);
            }
        });


    }
}
