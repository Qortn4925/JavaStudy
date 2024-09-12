package ch17.sec07.exam02;

import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)

        );

        students.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(System.out::println);

        students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);
    }
}
