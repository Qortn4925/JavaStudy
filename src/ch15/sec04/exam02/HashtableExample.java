package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

    public static void main(String[] args) {
//        Map<String, Integer> map = new Hashtable<>();
        Map<String, Integer> map = new HashMap<>();


        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1001; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };


        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i < 2000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception E) {

        }

        int size = map.size();
        System.out.println("size = " + size);
    }
}
