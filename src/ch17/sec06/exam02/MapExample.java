package ch17.sec06.exam02;

import java.util.Arrays;

public class MapExample {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        Arrays.stream(array).asDoubleStream()
                .forEach(System.out::println);

        System.out.println();


        Arrays.stream(array).boxed()
                .forEach(System.out::println);
    }
}
