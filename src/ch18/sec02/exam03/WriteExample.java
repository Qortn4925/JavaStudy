package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:/Temp/test3.db");
            byte[] arr = {1, 2, 3, 4, 5};
            os.write(arr, 1, 3);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
