package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for (Integer s : scores) {
            System.out.println("s = " + s);
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수" + scores.getFirst());
        System.out.println("가장높 점수" + scores.getLast());
        System.out.println("95아래" + scores.lower(scores.getLast()));
        System.out.println("95위에" + scores.higher(scores.getLast()));
        System.out.println("z" + scores.floor(scores.getLast()));
        System.out.println("85점 ㅡ 바로위" + scores.ceiling(85));

        NavigableSet<Integer> rangeset = scores.tailSet(80, true);
        for (Integer s : rangeset) {
            System.out.print(s + " ");
        }
        System.out.println();
        rangeset = scores.subSet(80, true, 90, false);
        for (Integer s : rangeset) {
            System.out.print(s + " ");
        }

    }
}
