package ch15.lecture.p03matrix;

import java.util.List;

public class C02Matrix {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        System.out.println(list1);

        List<List<Integer>> matrix = List.of(List.of(3, 1, 4, 5, 23),
                List.of(11, 22, 33, 45),
                List.of(-1, -2, 3)
        );

        System.out.println(matrix.get(1).get(2));

//        matrix.add(list1);
    }
}
