package ch15.sec05.exam04;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ComparatorExample {
    public static void main(String[] args) {

        // Comparator 는 추상클래스 >  그래서 람다로 구현
        TreeSet<Fruit> treeSet = new TreeSet<>((o1, o2) -> o1.price - o2.price);

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 1200));
        treeSet.add(new Fruit("딸기", 200));


        treeSet.forEach(f -> System.out.println(f.price + f.name));
        
    }
}
