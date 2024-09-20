package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C02Writer {
    public static void main(String[] args) {
        // 바이트 단위 io stream
        // input, output 스트림


        //문자 전용 IO Stream
        //writer, reader
        String name = "C:/Temp/output21.txt";


        try {
            Writer writer = new FileWriter(name);
            try (writer) {
                writer.write('안');
                writer.write('녕');
                writer.write('A');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
