package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for (i = 1; i < 101; i++) {

            sum = sum + i;
        }
        System.out.println(sum);


    }
}
