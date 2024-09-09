package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03Unmodifiable {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("java");
        list1.add("java1");
        list1.add("java2");
        Collections.sort(list1);


        // 수정 불가능한 리스트
        List<String> list2 = List.of("java", "spring", "css");
        // 밑에 줄 오류
//        Collections.sort(list2);
    }
}
