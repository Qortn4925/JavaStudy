package ch06.lecture.p06final;

import java.util.Arrays;

public class C03Final {
    public static void main(String[] args) {
        final int[] a = {3, 4};
//        a = new int[]{5, 6};
        a[0] = 33;
        //참조형에서 ,  a의 인스턴스 값이 변경된거지 , a의 주소값이 변경된건 아니라 ㅏㄱ능
        System.out.println(Arrays.toString(a));
        method1(a);
    }

    static void method1(final int[] a) {
        a[1] = 99;
        // a =new int[] {3,4};
        System.out.println(Arrays.toString(a));
    }
}
