package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {

        try {
            Writer writer = new FileWriter("C:/Temp/output22.txt");
            try (writer) {
                char a = 'A';
                writer.write(a);
                char b = 'B';
                writer.write(b);

                char[] arr = {'C', 'B', 'D'};
                writer.write(arr);

                writer.write("efg");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
