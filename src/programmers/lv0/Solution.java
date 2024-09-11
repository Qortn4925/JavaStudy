package programmers.lv0;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : my_string.toCharArray()) {
            map.put(ch, 1);
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            answer = answer + Character.toString(entry.getKey());
        }
        return answer;
    }
}