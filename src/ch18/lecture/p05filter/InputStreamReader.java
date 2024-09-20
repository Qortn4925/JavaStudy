package ch18.lecture.p05filter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputStreamReader {
    public static void main(String[] args) throws IOException {

        String name = "C:/Temp/output23.txt";
        InputStream is = new FileInputStream(name);

        int r1 = is.read();
        int r2 = is.read();
        int r3 = is.read();

        Reader reader = new java.io.InputStreamReader(is);

        int c1 = reader.read();
        System.out.println("(char) c1 = " + (char) c1);
    }
}
