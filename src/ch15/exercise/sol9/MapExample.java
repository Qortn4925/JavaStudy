package ch15.exercise.sol9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        //평균 , 최고 , 최고 점수 아이디


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer val = entry.getValue();
            if (val > maxScore) {
                maxScore = val;
                name = entry.getKey();
            }
            totalScore = totalScore + val;
        }

        System.out.println("종합점수" + totalScore / map.size());
        System.out.println("최고점수" + maxScore);
        System.out.println("최고점수 받은 아이디 : " + name);
        

    }
}
