package ch05.Exercise;

public class Sol08 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};

        int total = 0;
        for (int[] data : array) {
            for (int k : data) {
                total = k + total;
            }
        }

        System.out.println(total);
        System.out.println(total / (array[0].length + array[1].length + array[2].length));
    }
}
