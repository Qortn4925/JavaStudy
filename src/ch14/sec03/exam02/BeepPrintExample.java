package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
        }
    }
}
