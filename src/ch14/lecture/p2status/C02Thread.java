package ch14.lecture.p2status;

public class C02Thread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("쓰레드 1");
            }


        });
        t1.start();

        t1.join();  // 이 쓰레드가 끝나가리를 기다림   그 후 나머지 실행

        for (int i = 0; i < 10; i++) {
            System.out.println("메인 쓰레드 ");
        }
    }
}
