package programmers.lv0;


import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int j = numbers.length;
        int answer = 0;
        if (j % 2 == 0) {

            int na = j % 2;
            answer = numbers[na + 1];

        } else {


        }
        return answer;
    }
}