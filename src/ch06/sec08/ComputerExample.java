package ch06.sec08;

public class ComputerExample {


    public static void main(String[] args) {
        Computer co = new Computer();

        int result = co.sum(1, 2, 3);
        System.out.println(result);

        int result1 = co.sum(1, 2, 3, 4, 5);
        System.out.println("result1 = " + result1);

        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(co.sum(arr));
    }
}
