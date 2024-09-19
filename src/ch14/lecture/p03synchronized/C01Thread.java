package ch14.lecture.p03synchronized;

public class C01Thread {
    private static int value = 0;


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        // 메인 스레드에 있어서 ,    t1,t2 가 실행 되기 전에라서 0
        //원하는 코드를 출력하고 싶으면  join 작성 후에
        System.out.println("value = " + value);
        
        //  여러 쓰레드가
        // 같은 객체의 상태를 바꾸려고 할 때 매우 주의해야함
    }
}
