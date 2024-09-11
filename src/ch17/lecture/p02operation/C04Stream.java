package ch17.lecture.p02operation;

import java.util.List;
import java.util.stream.Stream;

public class C04Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 1, 9, 2, 10, 3);

        //최종 연산이 있어야  중간 연산도 실행됨
        //최종연산 min 줄  주석처리하면   숫자 아난옴

        Stream<Integer> stream = list.stream();
        Stream<Integer> peek = stream.peek(System.out::println);
        peek.min(Integer::compareTo);
        //최종연산이 끝난 스트림은 재사용할 수 없음

        Stream<Integer> stream1 = list.stream();
        stream1.max(Integer::compareTo);

        stream1.min(Integer::compareTo);// 다시  사용 x

        System.out.println("다음 코드");


    }
}
