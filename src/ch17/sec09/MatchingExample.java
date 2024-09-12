package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6};

        boolean result = Arrays.stream(arr)
                .allMatch((a) -> a % 2 == 0);
        System.out.println("모두 2의 배수" + result);

        boolean result2 = Arrays.stream(arr)
                .anyMatch((a) -> a % 3 == 0);
        System.out.println("하나라도 3의 배수 " + result2);

        boolean result3 = Arrays.stream(arr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수 x" + result3);
        
    }
}
