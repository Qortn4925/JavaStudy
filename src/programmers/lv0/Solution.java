package programmers.lv0;


import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String item : keyinput) {

            if (item.equals("left") && Math.abs(answer[0]) != maxX) {
                answer[0]--;
            } else if (item.equals("right") && Math.abs(answer[0]) == maxX) {
                answer[0]++;
            } else if (item.equals("up") && Math.abs(answer[1]) == maxY) {
                answer[1]++;
            } else if (item.equals("donw") && Math.abs(answer[1]) == maxY) {
                answer[1]--;
            }
        }
        return answer;
    }
}