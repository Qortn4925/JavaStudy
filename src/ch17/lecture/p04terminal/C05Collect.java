package ch17.lecture.p04terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class C05Collect {
    public static void main(String[] args) {

        //collect : 하나의 객체로 담아낸 , list, set, map 등으로
        // 그래서 두 개로 오버로딩 되어있는데 편하게 쓸거면
        //collectors 의 스태틱 메소드 쓰자


        List<Integer> list = List.of(3, 1, 4, 1, 5, 9, 2);
        List<Integer> collect = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        List<Integer> list1 = list.stream()
                .map(n -> n * 3)
                .toList();
        System.out.println("list1 = " + list1);

        Set<Integer> collect1 = list.stream()
                .map(n -> n * 4)
                .collect(Collectors.toSet());

        System.out.println("collect1 = " + collect1);

        //to Map 은  키 쌍으로 두개의 타입 파라미터가 필요하니까 
        // 두개의  갑승ㄹ 받음
        Map<Integer, Integer> collect2 = list.stream()
                .distinct()
                .map(n -> n * 5)
                .collect(Collectors.toMap(e -> e, e -> e + 1));

        System.out.println("collect2 = " + collect2);
    }
}
