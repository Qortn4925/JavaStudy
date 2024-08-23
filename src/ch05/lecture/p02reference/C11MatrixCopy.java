package ch05.lecture.p02reference;

import java.util.Arrays;

public class C11MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = new int[][]{
                new int[]{30, 40},
                new int[]{22, 11}
        };

        // 인스턴스 3개 저장됨, >>   배열의 주소값을  저장하고 있는 인스턴스.
        // mi의 요소들을 가지고 있는 인스턴스
        // m2의 요소들을 가지고 있는 인스턴스

        int[][] m2 = new int[m1.length][];
        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];
        }
        //이러면 값  바꾸면 다 바뀔거 같은데  >> m1의 주소값을 가진 [0],[1]을 가져오기때문에 그럼 ㅇㅇ
        m2[0][1] = 34;

        System.out.println((m2[0][1]));
        System.out.println((m1[0][1]));
    }
}
