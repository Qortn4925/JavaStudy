package ch04.Exercise;

public class Sol3_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i = i + 3) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
