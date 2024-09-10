package leetcode.p1748;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int sumOfUnique(int[] nums) {
        int answer = 0;
        //배열 전체 탐색 후
        // 수 , 몇 개)  count
        Map<Integer, Integer> map = new HashMap<>();

        // contains 사용하면 더 쉽게 품    ㅜ, ㅜ  ㅇ겹치는게 있는지 확인하기 위해서
        //for문을 한 번 더 돌았지만 >  그럴필요없이 할때마다 값을 가지고 있는지 확인하면 됨.
        // 걍 메소드를 새로 짜서 품
        for (int item : nums) {
            int key = item;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (key == nums[i]) {
                    count++;
                }
            }
            map.put(key, count);
        }


        //map을 전체 탐색 후
        //value 가  1인 키들의 합을
        //구해서 리턴
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                answer = answer + entry.getKey();
            }

        }

        return answer;
    }
}