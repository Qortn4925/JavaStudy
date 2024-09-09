package leetcode.p287;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {

        //매열 전체 탐색 
        //각 원소를 set 에 넣고 (add)
        //fasle가  리턴하면 >> 그 숫자를 리턴

        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.add(a)) {
                set.add(a);
            } else {

                return a;
            }
        }

        return 0;
    }
}
