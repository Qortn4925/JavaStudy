package ch05.sec06;

public class ArrayLength {
    public static void main(String[] args) {
        int[] score = new int[]{10, 20, 30};

        int sum = 0;
        for (int data : score) {
            sum = sum + data;
            System.out.println("data = " + data);
        }

        System.out.println(sum);

        double avg = (double) sum / score.length;
        System.out.println("avg = " + avg);
    }
}
