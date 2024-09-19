package ch14.lecture.p2status;

public class C01Thread {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드 !!!!!!!!");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드 22");
            }
        });

        t1.start();
        t2.start();
    }
}
