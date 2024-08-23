package ch05.lecture.p02reference;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C10ArrayCopy {
    public static void main(String[] args) {

        int[] a = {6, 7, 8};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        b[0] = 99;  // 이러면 b값만  왤까 ?  위에서 주소갑승ㄹ 가져온게 아니라 , 인덱스에 접근해 값만 가져와서
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
