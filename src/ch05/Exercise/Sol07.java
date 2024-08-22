package ch05.Exercise;

public class Sol07 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int data : array) {
            if (max < data) {
                max = data;
            }

        }
        System.out.println("max = " + max);
    }
}
