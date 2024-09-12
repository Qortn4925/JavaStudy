package ch17.lecture.p03intermediate;

import java.util.Arrays;

public class C05Boxed {
    public static void main(String[] args) {
        // Strema, IntStream, DoubleStream,LontStream

        // 참조타입 우너소  > 기본타입 원손
        //mapToInt, MapToDouble,MapToLoNG

        //기본타입 원소 sStream을 참조타입원소 Strema
        // :boxed 기본 > 참조

        int[] nums = {100, 1000, 10, 50, 500};
        Arrays.stream(nums)
                .boxed()
                .forEach(System.out::println);

        
        Arrays.stream(nums)
                .mapToObj(n -> n + "원")
                .forEach(System.out::println);
    }
}
