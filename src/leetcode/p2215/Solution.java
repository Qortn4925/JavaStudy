package leetcode.p2215;

import ch08.sec10.exam01.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        //문제 이해
        // 넘1 의 값이  넘2에 있으면 제외하고 리스트에 추가 
        //반대로 도 마찬가지

        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }


        for (int n : set2) {
            if (set.contains(n)) {
                set.remove(n);
            }
        }
        Set<Integer> temp = new HashSet<>(set);
        List<Integer> list = new ArrayList<>(set);
        result.add(list);
        for (int n : temp) {
            if (set2.contains(n)) {
                set2.remove(n);
            }
        }
        List<Integer> list1 = new ArrayList<>(set2);
        result.add(list1);

        return result;
    }
}