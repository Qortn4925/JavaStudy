package ch17.lecture.p04terminal;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class C04Reduce {
    public static void main(String[] args) {
        // sum ,avg , count , min , max

        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("sum = " + sum);
        ;


        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        double asDouble = average.getAsDouble();

        System.out.println("asDouble = " + asDouble);

        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println(max.getAsInt());

//        OptionalInt min = list.stream()
//                .mapToInt(Integer::intValue)
//                .min();

        int asInt = list.stream()
                .mapToInt(Integer::intValue)
                .min().orElse(0);


        System.out.println("min.getAsInt() = " + asInt);


        long count = list.stream()
                .mapToInt(Integer::intValue)
                .count();

        System.out.println(count);

    }
}
