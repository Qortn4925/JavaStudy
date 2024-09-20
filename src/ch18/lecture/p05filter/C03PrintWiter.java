package ch18.lecture.p05filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class C03PrintWiter {
    public static void main(String[] args) throws IOException {

        String name = "C:/Temp/output53.txt";
        Writer writer = new FileWriter(name);

        writer.write("추석 연휴가 짧아요");
        writer.write("내년이 기대됩니다.\n");

        writer.close();

        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println("설날 연휴가 기다려집니다.");
        printWriter.println("올해는 쉬는 날이 없어요.");
        
    }
}
