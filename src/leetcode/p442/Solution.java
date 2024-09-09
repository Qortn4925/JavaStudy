package leetcode.p442;


import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {


        //list 풀

        //list 로 품
//
//        List<Integer> list = new ArrayList<>();
//        // 중복 숫자 체크
//        Arrays.sort(nums);
//        int temp = 0;
//        for (int items : nums) {
//
//            if (temp == items) {
//                list.add(items);
//            }
//            temp = items;
//        }
//
//        //중복 숫자 넣기 ?
//        return list;

        //리스트랑 set 섞어서 품 , > set은 중복 입력 안되니까 중복입력 안될때> 즉 중복될때
        // list에 추가
        // set

        //set list 섞음 >> 강사님이랑 같은 풀이

        /*
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int itmes : nums) {
            if (set.add(itmes)) {
            } else {
                list.add(itmes);
            }

        }
        return list;
        */


        // 뭔 말인지 이해가 안가는 풀이
        /*
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            //배열에서 특정값을 절댓값으로 받고 -1
            int index = Math.abs(num) - 1;

            //배열의 인덱스가 0보다 작으면
            if (nums[index] < 0) {
                //리스트에 -1한 값을 추가
                duplicates.add(index + 1);
            } else { //0보다 크면 > 
                nums[index] = -nums[index];
            }
        }

        return duplicates;
        */

        return new ArrayList<>();
    }
}