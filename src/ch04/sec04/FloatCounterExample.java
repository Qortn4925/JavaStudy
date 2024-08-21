package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            //10번 미만 함
            System.out.println("x = " + x);
        }
    }
}
