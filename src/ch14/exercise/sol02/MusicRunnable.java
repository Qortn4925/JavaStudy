package ch14.exercise.sol02;

public class MusicRunnable extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("뮤직 재생");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
