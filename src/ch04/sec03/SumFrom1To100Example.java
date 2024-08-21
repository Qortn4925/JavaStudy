package ch04.sec03;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }

        // 1~ 100 까지의 합 인데 101 이 되어있을테니까 -1
        System.out.println("1~" + (i - 1) + "합" + sum);
    }
}
