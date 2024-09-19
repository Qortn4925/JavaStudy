package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05Copy {
    public static void main(String[] args) {

        String original = "C:/Temp/image-12.png";
        String target = "C:/Temp/image-11.png";

        try {
            InputStream is = new FileInputStream(original);
            OutputStream os = new FileOutputStream(target);
            try (is; os;) {
                byte[] data = new byte[100];

                int len = 0;

                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
