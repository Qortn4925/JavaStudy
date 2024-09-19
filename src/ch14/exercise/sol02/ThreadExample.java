package ch14.exercise.sol02;

public class ThreadExample {
    public static void main(String[] args) {

        Thread thread = new MovieThread();
        thread.start();

        Thread thread1 = new Thread(new MusicRunnable());
        thread1.start();
    }
}
