package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("홍길동", "남", 95),
                new Student("오해영", "여", 93)
        );


        list.stream()
                .collect(Collectors.groupingBy(x -> x.getSex().equals("남") ? "남" : "여"))
                .forEach((x, y) -> System.out.println(x + " : " + y.get(0).getName()));


    }
}
