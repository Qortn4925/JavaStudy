package leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Boolean> kidswithCandies(int[] candies, int extraCandies) {

        List<Integer> kids = Arrays.stream(candies).boxed().toList();
//        //가장 많은 캔디 수 max 구하기
//        Integer max = 0;
//        for (Integer candy : kids) {
//            max = Math.max(max, candy);
//        }
//
//        List<Boolean> result = new ArrayList<>();
//
//
//        for (Integer candy : kids) {
//            boolean k = (candy + extraCandies) >= max;
//            result.add((candy + extraCandies) >= max);
//        }

//        return result;
        //각 아이들의 캔디에 추가 캔디 더해서 max보다 크거나 같은지 확인하깅
        // 크면 true,아니면 else

        // 컬렉션 풀이
        //  인트형 배열을 스트림으로 바꾸면 > IntStream이라서 반환 값도
        // Integer 여야햇음 그래서 boxed 섞어서  boolean 값 집어 넣ㅇ느거

        Integer max = kids.stream()
                .max(Integer::compareTo)
                .get();

        return Arrays.stream(candies)
                .map(x -> x = x + extraCandies)
                .boxed()
                .map(x -> x >= max)
                .collect(Collectors.toList());


    }
}
