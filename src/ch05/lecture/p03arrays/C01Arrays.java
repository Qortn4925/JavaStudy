package ch05.lecture.p03arrays;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
//        Arrays : 배열에 관련된 유용한 메소드 들이 있는 클래스 .!!
        // toString  배열의 요소들 출력하기 편하게 ㅇㅇ
        int[] a = {5, 6, 7};
        System.out.println(a);
        System.out.println(Arrays.toString(a));

        int[][] b = {{4, 5}, {9, 8}};
        // 주소나올거임
        System.out.println(Arrays.toString(b));
        // 깊게 보고 싶을때
        System.out.println(Arrays.deepToString(b));
        int[][][] c = {{{6, 1}, {8, 3}}, {{3, 4}, {1, 3}}, {{2, 3}, {1, 5}}};

        System.out.println(Arrays.deepToString(c));

        // copy of  크기와 ,길이 , copyArray값 바꿔도 d 에 영향 xd
        int[] d = {100, 200};
        int[] copyArray = Arrays.copyOf(d, d.length);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(copyArray));
        copyArray[0] = 110;
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(copyArray));

        int[][] f = {{5, 1}, {4, 0}};
        int[][] g = Arrays.copyOf(f, f.length);

        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));
        g[0][0] = 56;
        System.out.println(Arrays.deepToString(f));
        System.out.println(Arrays.deepToString(g));
        // equals
        int[] h = {3, 4, 5};
        int[] i = {3, 4, 5,};
        System.out.println(h == i);

        System.out.println(Arrays.equals(h, i));
        int[][] j = {{3, 4}, {5, 6, 7}};
        int[][] k = {{3, 4}, {5, 6, 7}};
        // 이러면 참조타입 비교해서 둘이 저장된 위치 달라서 xx
        System.out.println(j == k);
        System.out.println(Arrays.equals(j, k));
        System.out.println(Arrays.deepEquals(j, k));

        int[] l = new int[3];
        System.out.println(Arrays.toString(l));
        //(배열명 , 값)
        Arrays.fill(l, 99);
        System.out.println(Arrays.toString(l));

        //sort
        int[] m = {9, 4, 1, 10, 20};
        System.out.println(Arrays.toString(m));
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

    }

}
