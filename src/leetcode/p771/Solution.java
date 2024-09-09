package leetcode.p771;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        //set 사용
        /*
        int result = 0;
        //jewels 의 값을 >> set에 집어 넣고
        //stone을 포문 굴려서 비교
        // 포문에 set에 집어넣으려 한늗 ㅔ튕기는 횟수 >> result

        Set<String> set = new HashSet<>();

        for (char c : jewels.toCharArray()) {
            set.add(String.valueOf(c));
        }

        for (char c : stones.toCharArray()) {

            if (set.contains(String.valueOf(c))) {
                result++;
            }

        }

        return result;

         */

        return 0;
    }
}

