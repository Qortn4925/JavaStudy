package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) throws IOException {
        String original = "C:/Temp/image-12.png";
        String target = "C:/Temp/image.png";

        InputStream is = new FileInputStream(original);
        OutputStream os = new FileOutputStream(target);
        byte[] data = new byte[1024];

        while (true) {
            int num = is.read(data);
            if (num == -1) break;

            os.write(data, 0, num);
        }
        os.flush();
        os.close();
        is.close();
        System.out.println("복사가 잘 됨");
    }
}
