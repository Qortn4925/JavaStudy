package leetcode.p1684;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        //알게된 사실 조건문에쓴 set.add문도 추가되니까 쓰지말자

/*
        // 입력한 문자열만 > 있는 횟수를 구하는 거임 , 다른거 말고
        //일단 set에  allwed 의 값을 넣고
        // for문으로 words 돌아서 >  조건문 작성
        int result = 0;
        boolean flag = false;
        Set<String> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(String.valueOf(c));
        }

        //스트링
        for (String s : words) {

            for (char c : s.toCharArray()) {
                //값이 들어간다는건 set에 있는거 제외 다른게 있다
                if (!set.contains(String.valueOf(c))) {
                    flag = false;
                    break;
                } else {
                    flag = true;

                }
            }
            if (flag == true)
                result++;
        }

        return result;

 */
        return 0;
    }
}
