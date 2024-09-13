package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {
        //List : 요소(element)의 순서가 있는 컬렉션

        List<String> list = new ArrayList<>();

        //element 추가
        // add, set
        list.add("java");
        list.add("react");
        list.add(new String("css"));
        list.add("spring");
        list.add("java");
        //1번 인덱스 react를 vue로 교환
        list.set(1, "vue");
        //특정 번호에 값 집어넣기 , 그 뒤에는 밀려서 +1됨
        list.add(2, "jsp");
        // 넣은 순서대로 
        System.out.println(list.toString());
        //element 얻기 //index로 접근 배열이랑 같이 0부터 시작
        String s = list.get(0);
        String s1 = list.get(2);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        //element 확인(검색)
        // contains
        boolean r1 = list.contains(new String("css"));
        boolean r2 = list.contains("html");
        //입력 받는 스트링 객체와  , 확인할때 적은 css는 서로 다른 객첸데
        // contains에는 같다고  출력  r1= true
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        //element 수 확인
        // size , isEmpty 
        int size = list.size();  //갯수
        boolean r3 = list.isEmpty();// 비었는지
        System.out.println("r3 = " + r3);
        System.out.println(size);
    }
}
