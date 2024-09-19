package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {

                }
            }
        };

        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");

            Thread.sleep(500);
        }
    }
}
