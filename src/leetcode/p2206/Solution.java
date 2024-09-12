package leetcode.p2206;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public boolean divideArray(int[] nums) {

        // 내가 짠 코드
        /*
        boolean result = false;
        //배열을 전체 탐색해서
        //각 수가 몇 개인지 저장
        // map을 전체 탐색해서 value가 홀 수 인 것이 있으면
        //return false
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            // Integer v= map.getOrDefault(num,0)
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        if (nums.length % 2 == 1) {
            return false;
        } else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (!(entry.getValue() % 2 == 0)) {
                    return false;
                }

            }
            return true;


         */

        // 강사님
        /*
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색 해서
        // 각 수가 몇 개인지 저장(map)
        for (int num : nums) {
            Integer v = map.getOrDefault(num, 0);
            map.put(num, v + 1);
        }

        // map을 전체 탐색해서 value가 홀 수인 것이 있으면
        // return false
        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                return false;
            }
        }

        return true;*/

        // 스트림 풀이

        Map<Integer, Long> amp = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        amp.values().stream().allMatch(e -> e % 2 == 0);

        return true;
    }
}