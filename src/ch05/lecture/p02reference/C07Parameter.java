package ch05.lecture.p02reference;

public class C07Parameter {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4},
                {5, 7}
        };
        System.out.println(arr[0][0]);
        method(arr);
        System.out.println(arr[0][0]);
    }


    public static void method(int[][] b) {
        System.out.println(b[0][0]); // 3
        b[0] = new int[]{33, 44};
        System.out.println(b[0][0]); // 33
    }
}
