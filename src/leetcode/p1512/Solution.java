package leetcode.p1512;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        //키값이 같아서 당연히 오류 > 키 밸류 바꾸면 바로 풀림
        /*
        // 일단 배열 전체탐색해서
        // map 에 넣기
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // 1 ,0
        //2,1
        //3,2
        //1,3

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
                if (key == entries.getKey() && value < entries.getValue()) {
                    result++;
                }
            }
        }

        // output 조건
        // 둘의 키 값이 같은데 >   밸류값이 더크면(index)번호가 더 크면 순서쌍으로 치겠다
        return result;
        
         */

        //그냥 깡 풀이
/*
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        // 배열을 순회하며 각 숫자의 빈도를 업데이트
        for (int num : nums) {
            // 숫자의 현재 빈도를 가져오고, 빈도가 1 증가함
            int count = map.getOrDefault(num, 0);
            // 좋은 쌍의 수를 계산하여 결과에 추가
            result += count;
            // 빈도를 1 증가시킴
            map.put(num, count + 1);
        }



        return result;
        */

        // 조합
        /*
        Map<Integer, Integer> map = new HashMap<>();
        // 배열을 전체 탐색해서
        // 각 수가 몇개인지 저장(map)
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            map.computeIfPresent(num, (k, v) -> v + 1);
        }

        // map을 전체 탐색하면서
        // value로 vC2 을 구해서 더하기
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();

            int c = value * (value - 1) / 2;
            sum += c;
        }


        return sum;
        */
        return 0;
    }
}