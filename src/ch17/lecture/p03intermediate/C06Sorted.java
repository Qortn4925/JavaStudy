package ch17.lecture.p03intermediate;

import java.util.Comparator;
import java.util.List;

public class C06Sorted {
    public static void main(String[] args) {

        List<Integer> list = List.of(6, 1, 9, 0, 10, 1, 3, 7);

        list.stream()
                .sorted()
                .forEach(System.out::println);


        list.stream() // 음수니까 더 작은거 부터
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);


        list.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        return b - a;
                    }
                })
                .forEach(System.out::println);

        System.out.println("compator.reverorder");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        
    }
}
