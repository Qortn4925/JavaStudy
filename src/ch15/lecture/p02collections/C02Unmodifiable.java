package ch15.lecture.p02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("css");
        list.add("111");
        list.add("222");
        list.add("333");

        // 수정 불가능한 컬렉션  , 리스트 ,셋 , 맵
        List<String> unmdodi = Collections.unmodifiableList(list);
        System.out.println(unmdodi);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);
        // 수정 불가능한거
//        Collections.sort(unmdodi);
        System.out.println("unmdodi = " + unmdodi);

    }
}
