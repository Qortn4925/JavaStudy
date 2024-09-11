package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신", 20),
                new Student("용", 30)
        );
        // method chaining
        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();


        Stream<Student> stream = list.stream();
        IntStream stream1 = stream.mapToInt(studnet -> studnet.getScore());
        double avg1 = stream1.average().getAsDouble();

        System.out.println("avg1 = " + avg


        );
        System.out.println("avg1 = " + avg1);

    }
}
