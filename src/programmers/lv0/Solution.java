package programmers.lv0;


import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static int solution(int[] array, int n) {
        // 정수 배열 생성


        for (int i = 0; i < array.length; i++) {
            int k = array[i] - n >= 0 ? Math.abs(array[i] - n) : -Math.abs(array[i] - n);
            array[i] = k;
        }
        Arrays.sort(array);
        return array[1];
    }

    public static void main(String[] args) {

        int[] array = {10, 11, 12};
        Solution.solution(array, 12);

    }
}
