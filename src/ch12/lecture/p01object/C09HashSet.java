package ch12.lecture.p01object;

import java.util.HashSet;

public class C09HashSet {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add("java");
        set.add("css");

        int s1 = set.size();
        System.out.println("s1 = " + s1);

        // 같은건 안 담김
        set.add("java");
        System.out.println(set.size());
        set.add(new String("java"));
        // 인스턴스 새로 만들면 담기나 확인 , 담기지 ㅇ낳음 > eqauals 메소드 재정의해서 그럼
        System.out.println(set.size());
    }
}
