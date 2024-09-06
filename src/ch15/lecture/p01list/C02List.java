package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02List {


    public static void main(String[] args) {
        //list 전체
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("git");
        list.add("sql");
        list.add("mybatis");

        // 고전적 for
        System.out.println("---고전적 for----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //향상된 for
        System.out.println("----향상된 for_----");
        for (String elem : list) {
            System.out.println(elem);
        }

        //Iterator 사용
        System.out.println("---iterator---");
        Iterator<String> iterator = list.iterator();
        //iterator 변수가 다음에 탐색할게 있다면 다음으로 넘어감
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //forEach 메소드
        System.out.println("---forEach----");

        //이거 헷갈리면 api 읽어보삼
        list.forEach((e) -> System.out.println(e));
        //같은일
        list.forEach(System.out::println);

    }


}
