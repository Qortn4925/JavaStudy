package ch17.exercise.sol7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        list.stream()
                .filter(x -> x.getJob().equals("개발자"))
                .forEach(x -> System.out.println(x.getName()));

    }
}
