package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C04InputStream {
    public static void main(String[] args) {

        String name = "C:/Temp/output6.txt";

        try (InputStream is = new FileInputStream(name)) {
            byte[] data = new byte[5];
            int length = 0;
            while ((length = is.read(data)) != -1) {
                System.out.println(Arrays.toString(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
