package ch14.lecture.p01thread;

import java.awt.*;

public class C01Thread {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // 소리 출력 스레드
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("띵");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t2.start();
    }
}
