package ch05.lecture.p01array;

public class C04Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 30;
        a[1] = 31;
        a[2] = 32;
        a[3] = 33;
        a[4] = 34;

        System.out.println("a[0] = " + a[0]);
        System.out.println("a[0] = " + a[1]);
        System.out.println("a[0] = " + a[2]);
        System.out.println("a[0] = " + a[3]);
        System.out.println("a[0] = " + a[4]);

        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + a[i]);
        }
    }
}
