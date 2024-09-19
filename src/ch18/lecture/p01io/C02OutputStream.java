package ch18.lecture.p01io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/output2.txt";
        OutputStream os = new FileOutputStream(file);

        os.write(-128);

        os.write(2100000000);

    }
}
