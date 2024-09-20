package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class C03Writer {
    public static void main(String[] args) {

        String name = "C:/Temp/output23.txt";
        try {
            Scanner sc = new Scanner(System.in);
            Writer writer = new FileWriter(name);
            try (sc; writer) {
                while (true) {
                    System.out.print("글자 입력 >> :");
                    String line = sc.nextLine();
                    if (line.equals("종료")) {
                        break;
                    }
                    
                    writer.write(line);
                    // 엔터
                    writer.write('\n');

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
