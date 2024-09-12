package ch17.exercise.sol5;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Exmpressions",
                "Java8 supports lambda expressions"
        );

        String regx = "^java$^Java$";
//        list.stream()
//                .filter(s -> Pattern.compile(regx))
//                .forEach(System.out::println);

    }
}
