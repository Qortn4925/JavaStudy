package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Optional;

public class C03Reduce {

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        Optional<Integer> sum1 = list.stream()
                .reduce(Integer::sum);

        Integer s1 = sum1.get();

        System.out.println("s1 = " + s1);


        List<Integer> objects = List.<Integer>of();

        Optional<Integer> sum2 = objects.stream()
                .reduce(Integer::sum);

//        exception
//        Integer i = sum2.get();
        //가져오는데 없으면 파라티머에 입력해놓은값
        Integer i = sum2.orElse(0);
        System.out.println("i = " + i);

    }
}
