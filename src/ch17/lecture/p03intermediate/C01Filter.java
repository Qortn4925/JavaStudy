package ch17.lecture.p03intermediate;

import java.util.List;
import java.util.function.Predicate;

public class C01Filter {


    public static void main(String[] args) {
        //filter :
        List<Integer> list = List.of(100, 200, 10, 20, 30, 300, 40);
        long count1 = list.stream().filter(e -> e >= 100 && e <= 999)
                .count();


        long count = list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer e) {
                return e >= 10 && e <= 100;
            }
        }).count();

        System.out.println("count = " + count);
        System.out.println("count1 = " + count1);

        int count2 = 0;
        for (Integer item : list) {
            if (item >= 100 && item < 1000) {
                count2++;
            }
        }

        
    }
}
