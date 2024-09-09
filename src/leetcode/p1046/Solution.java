package leetcode.p1046;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int lastStoneWeight(int[] stones) {

        // 리스트로 풀기
        /*
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        while (list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            int max1 = list.remove(0);
            int max2 = list.remove(0);

            if (max1 > max2) {
                list.add(max1 - max2);
            }
        }

        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0);
        }
        */

        // 배열로
        int n = stones.length;
        for (int i = 0; i < n - 1; i++) {
            Arrays.sort(stones);  // 배열을 내림차순으로 정렬
            for (int j = 0; j < n / 2; j++) {
                int temp = stones[j];
                stones[j] = stones[n - 1 - j];
                stones[n - 1 - j] = temp;
            }

            // 가장 무거운 두 돌을 부딪힘
            stones[n - 1] = stones[n - 2] - stones[n - 1];
            stones[n - 2] = 0;
        }

        return stones[n - 1];
    }
    
}