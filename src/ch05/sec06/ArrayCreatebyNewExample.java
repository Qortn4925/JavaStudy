package ch05.sec06;

public class ArrayCreatebyNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("arr1 = " + arr1[i]);
        }

        arr1[0] = 1;
        arr1[1] = 11;
        arr1[2] = 2;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1 = " + arr1[i]);
        }

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1 = " + arr2[i]);
        }


        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2 = " + arr2[i]);
        }

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3 = " + arr3[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";

        for (int i = 0; i < 3; i++) {
            System.out.println("arr3 = " + arr3[i]);
        }
    }
}
