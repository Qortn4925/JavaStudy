package ch18.lecture.p04reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C01Reader {
    public static void main(String[] args) throws IOException {
        // reader:   문자전용 InputStream

        String name = "C:/Temp/output23.txt";

        Reader reader = new FileReader(name);
        int c1 = reader.read();

        char c2 = (char) c1;
        
        System.out.println("c2 = " + c2);
    }

}
