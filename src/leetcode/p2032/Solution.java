package leetcode.p2032;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        // 풀다 틀렸는데 뭐가 문제인지 잘 모르겠음
        /*
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
//입력 배열 3개중에서  두 번 혹은 3번 그 값이 겹치면 > 리스트에 추가
        //그럼 전체 탐색을 해야하는거임
        for (int item : nums1) {
            set.add(item);
        }

        for (int item : nums2) {
            //참이면 들어감 >> ! > false
            if (!set.add(item) && !list.contains(item)) {
                list.add(item);
            }
        }

        for (int itme : nums3) {
            if (!set.add(itme) && !(list.contains(itme))) {
                list.add(itme);
            }
        }

        return list;
       
 */

        //set 변수 설정 많이해서 풀기
        /*
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // nums1 배열에서 숫자를 기록
        for (int num : nums1) {
            set1.add(num);
        }

        // nums2 배열에서 숫자를 기록
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
            set2.add(num);
        }

        // nums3 배열에서 숫자를 기록
        for (int num : nums3) {
            if (set1.contains(num) || set2.contains(num)) {
                resultSet.add(num);
            }
            set3.add(num);
        }

        // 결과를 리스트로 변환
        return new ArrayList<>(resultSet);

         */

        return new ArrayList<>();
    }
}

