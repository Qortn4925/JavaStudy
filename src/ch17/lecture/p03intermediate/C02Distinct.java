package ch17.lecture.p03intermediate;

import java.util.List;

public class C02Distinct {
    public static void main(String[] args) {
        //distinct : 중복 제거

        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        long count = list.stream()
                .distinct()
                .count();
        System.out.println("count = " + count);
        
    }
}
