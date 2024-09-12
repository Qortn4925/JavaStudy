package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("홍길동", "남", 92));
        list.add(new Student("김수영", "여", 87));
        list.add(new Student("김자바", "남", 95));
        list.add(new Student("오해영", "여", 93));

        list.stream()
                .filter(e -> e.getSex().equals("남"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .collect(Collectors.toMap(s -> s.getName(), e -> e.getScore()))
                .entrySet()
                .forEach(System.out::println);
    }
}
