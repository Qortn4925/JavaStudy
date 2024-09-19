package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C01InputStream {
    public static void main(String[] args) {

        //InputStream: 입력 스트림

        String name = "C:/Temp/output6.txt";
        try (InputStream is = new FileInputStream(name)) {

            int r1 = is.read();  // 4byte 중 1 byte 읽고 나머진 다 0

            System.out.println(r1);
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read());
            System.out.println(is.read()); // 다 읽으면 -1 리턴
            // 값이 -1 이면 다 읽을거니까   반복문 조건


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
