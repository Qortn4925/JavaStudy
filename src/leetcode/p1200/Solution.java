package leetcode.p1200;

import ch08.sec10.exam01.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> matrix = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);


        for (int i = 1; i < arr.length; i++) {
            int dif = arr[i] - arr[i - 1];
            if (dif < min) {
                min = dif;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int dif = arr[i] - arr[i - 1];
            if (dif == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i - 1]);
                matrix.add(list);
            }
        }
        return matrix;
    }
}