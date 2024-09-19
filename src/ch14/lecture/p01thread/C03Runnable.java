package ch14.lecture.p01thread;

import java.awt.*;

public class C03Runnable {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        for (int i = 0; i < 5; i++) {

            System.out.println("띠링");

        }
    }
}
