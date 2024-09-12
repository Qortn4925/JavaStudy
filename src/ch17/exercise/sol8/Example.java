package ch17.exercise.sol8;

import ch17.exercise.sol7.Member;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<ch17.exercise.sol7.Member> list = Arrays.asList(
                new ch17.exercise.sol7.Member("홍길동", "개발자"),
                new ch17.exercise.sol7.Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        list.stream()
                .filter(x -> x.getJob().equals("개발자"))
                .forEach(x -> System.out.println(x.getName() + ": " + x.getJob()));

        list.stream()
                .filter(x -> x.getJob().equals("디자이너"))
                .forEach(x -> System.out.println(x.getName() + ": " + x.getJob()));


    }
}
