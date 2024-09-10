package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println(map.size());
        System.out.println(map);

        String key = "홍길동";
        Integer value = map.get(key);
        System.out.println("value = " + value);

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k + ":" + map.get(k));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());
    }
}
