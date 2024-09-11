package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] str = {"홍", "길", "동"};
        Stream<String> stream = Arrays.stream(str);

        stream.forEach(System.out::print);
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream1 = Arrays.stream(arr);
        stream1.forEach(a -> {
            System.out.println(a);
        });

        
    }
}
