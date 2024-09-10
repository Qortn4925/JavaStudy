package leetcode.p2363;

import ch08.sec10.exam01.A;

import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        Map<Integer, Integer> map = new HashMap<>();

        // 일단 한 번  map 에 넣음 중복은 없으니까 그냥 넣기

        //  1,1 을 넣고싶으면
        // n, n
        for (int[] n : items1) {
            map.put(n[0], n[1]);
        }

// 배열 2에 0번째인덱스 > map키 를 가지고 잇으면>  1번째 인덱스에 합치고 싶은거잖아 > 그리고 리스트로 변환
        for (int[] n : items2) {
            map.put(n[0], map.getOrDefault(n[0], 0) + n[1]);
        }
        List<List<Integer>> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            list.add(pair);

        }

        // comparator
        Collections.sort(list, (a, b) -> a.get(0) - b.get(0));
        return list;
    }
}