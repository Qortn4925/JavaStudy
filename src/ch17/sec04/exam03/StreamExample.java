package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    private static int sum;

    public static void main(String[] args) {

        //폐구간

        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(a -> sum += a);

        System.out.println("sum = " + sum);
    }
}
