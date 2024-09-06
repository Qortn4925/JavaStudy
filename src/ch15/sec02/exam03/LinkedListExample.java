package ch15.sec02.exam03;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        // 둘다 List 인터페이스라 add 라느 기능으 ㄹ가지고 있지만
        //구현 클래스는  arrylist 와  linked 리스트라서  동작 방식은 다름
        // 끝에 넣을떄는 비슷비슷 하네

        long start = System.nanoTime();
        //array리스트는 하나 추가할떄마다 나머지를 다 한 칸식 옮겨야 해서 중간 삽입 과정이 더 오래걸림
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        long end = System.nanoTime();

        System.out.println(end - start + "nano second");
        start = System.nanoTime();
        //링크드 리스트는 한 ㅏ추가할때 앞 뒤에 정보값만 이어주면 되서 훨씬 중간 삽입 과정이 훨씬 저렴함
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        end = System.nanoTime();
        System.out.println(end - start + "nano second");

    }
}
