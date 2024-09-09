package leetcode.p118;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //하나의 과정을 만들고 끝날때 마다 , > 리스트에 추가
        List<List<Integer>> matrix = new ArrayList<>();
        int count = 0;//첫 번째 리스트 {1} 리스트 가지고 있느 갯수
        int index = 0; // >리스트 안에 요소의 갯수
        while (count < numRows) {
            //하나의 리스트 만들기
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int i = 1; i < count; i++) {
                list.add(matrix.get(count - 1).get(i - 1) + matrix.get(count - 1).get(i));
            }
            if (count == 0) {

            } else {
                list.add(1);
            }
            matrix.add(list);
            count++;
        }
        return matrix;


    }
}
