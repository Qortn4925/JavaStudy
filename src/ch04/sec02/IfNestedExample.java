package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81;
        System.out.print("점수 :" + score);

        if (score > 90) {
            System.out.println("90이상");
         
        }
    }
}
