package ch14.lecture.p03synchronized;

public class C02Thread {
    private static int value = 0;

    private static Object o = new Object();  // lock  , monitor

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) {
                    value++;
                }
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (o) {
                    value++;
                }
            }

        });

        System.out.println("value = " + value);
    }
}
