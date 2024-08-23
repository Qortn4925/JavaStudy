package ch05.lecture.p02reference;

import java.util.Arrays;

public class C12MatrixCopy {
    public static void main(String[] args) {

        int[][] m1 = {{98, 76, 65}, {54, 21, 11}};

        // m2에 m1을 복사하는 코드 작성

        //m2[0][0] = 1010;

        int[][] m2 = new int[m1.length][m1[0].length];  // 뒤에는 줄필요가 없네 , ㅋㅋㅋ 생각해보니
        //요는 주소값을 통해서 접근하는게 아니라 , 직접 값을 바로 그 공간에 박아 넣어야하는거임
        // 그래서 복사 할때 이렇게 귀찮게 하는거고
        // 기본형 처럼 a=b 하고 끝내버리는게 아니라 ㅇㅇ
        for (int i = 0; i < m1.length; i++) {
            for (int k = 0; k < m1[i].length; k++) {
                m2[i][k] = m1[i][k];
            }
        }

        m2[0][0] = 11;

        System.out.println(m1[0][0]);
        System.out.println(m2[0][0]);


    }
}
