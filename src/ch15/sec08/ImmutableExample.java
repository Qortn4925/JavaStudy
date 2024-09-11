package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {

        List<String> immutableLIST1 = List.of("a", "b", "c");
//        immutableLIST1.add("d");

        Set<String> set1 = Set.of("a", "b", "c");
//        set1.add("d");
        Map<Integer, String> map1 = Map.of(1, "A", 2, ",b", 3, "c");
//        map1.put(1, "d");

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        List<String> liset2 = List.copyOf(list);

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Set<String> set2 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

//        Map<Integer, String> map2 = Map.copyOf(map);


    }

}
