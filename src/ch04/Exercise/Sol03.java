package ch04.Exercise;

public class Sol03 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {

            if (i % 3 == 0) {
                System.out.println("i = " + i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum + "총합");
    }
}
