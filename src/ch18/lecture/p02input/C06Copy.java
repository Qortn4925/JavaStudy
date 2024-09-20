package ch18.lecture.p02input;

import java.io.*;

public class C06Copy {
    public static void main(String[] args) throws IOException {
        String origin = "C:/Temp/image.png";
        String target = "C:/Temp/image20.png";

        InputStream is = new FileInputStream(origin);
        OutputStream os = new FileOutputStream(target);

        is.transferTo(os);
        
    }
}
