package ch05.lecture.p01array;

public class C06EnhancedFor {
    public static void main(String[] args) {
        int arr[] = new int[]{99, 80, 33};

        // 자바의 신  new for
        for (int data : arr) {
            System.out.println("data = " + data);
        }
    }
}
