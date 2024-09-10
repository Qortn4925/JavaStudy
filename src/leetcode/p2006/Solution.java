package leetcode.p2006;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countKDifference(int[] nums, int k) {

        // 쓰레기 풀이
        /*
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        map.put(k, result);


        //그니까  math.abs  둘이 뺀 값  >

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    result++;
                }
            }
        }

        return result;

         */

        // map  , 조건 만족해서 넣을수 있는 방법을 좀더 생각해보자  별로 어렵지 않다
        /*
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        // 배열을 순회하며 숫자의 빈도를 HashMap에 저장
        for (int num : nums) {
            // 현재 숫자와 차이가 k인 두 경우를 확인
            // case 1: num - k
            // case 2: num + k
            result += map.getOrDefault(num - k, 0); // num - k가 map에 있는 경우, 그 빈도만큼 결과에 추가
            result += map.getOrDefault(num + k, 0); // num + k가 map에 있는 경우, 그 빈도만큼 결과에 추가

            // 현재 숫자의 빈도를 1 증가시킴
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result;*/

        return 0;

    }
}