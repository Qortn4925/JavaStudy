package ch17.lecture.p01stream;

import java.util.Random;
import java.util.stream.IntStream;

public class C03Stream {
    public static void main(String[] args) {

        IntStream stream = IntStream.range(0, 5);  // 0~ 4  끝 숫자는 포함 x
        int sum = stream.sum();

        System.out.println("sum = " + sum);

        Random random = new Random();
        IntStream randomStream = random.ints(1, 46);

        //중복하지 않고 ,  1보다 크고 45 숫자 사이에서 6개만 , 출력해라
        randomStream.distinct().
                limit(6).
                forEach(System.out::println);

    }
}
