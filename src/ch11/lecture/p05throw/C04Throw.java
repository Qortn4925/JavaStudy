package ch11.lecture.p05throw;

import java.io.IOException;

public class C04Throw {
    public static void action1() throws IOException {
        throw new IOException();
    }

    public static void action() throws IOException {

        action1();

    }

    public static void action3() throws IOException {
        action();
    }

    public static void action4() {

        try {
            action3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
