package ch17.lecture.p04terminal;

import java.util.Arrays;

public class C02Reduce {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};

        int result = 0;

        for (int n : arr) {
            result = apply(result, n);
        }

        System.out.println("result = " + result);

        //reduce
        int k = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        System.out.println("k = " + k);

        int j = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + 1);
        System.out.println("j = " + j);

        int reduce = Arrays.stream(arr)
                .reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("reduce = " + reduce);


    }

    public static int apply(int a, int b) {
        return a + b;
    }
}
