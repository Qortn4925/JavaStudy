package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidswithCandies(int[] candies, int extraCandies) {

        List<Integer> kids = Arrays.stream(candies).boxed().toList();
        //가장 많은 캔디 수 max 구하기
        Integer max = 0;
        for (Integer candy : kids) {
            max = Math.max(max, candy);
        }

        List<Boolean> result = new ArrayList<>();


        for (Integer candy : kids) {
            boolean k = (candy + extraCandies) >= max;
            result.add((candy + extraCandies) >= max);
        }

        return result;
        //각 아이들의 캔디에 추가 캔디 더해서 max보다 크거나 같은지 확인하깅
        // 크면 true,아니면 else


    }
}
