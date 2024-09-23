package ch19.lecture.p01network;

import java.io.*;
import java.net.Socket;

public class C04Client {
    public static void main(String[] args) {

        //파일을 내보낼거
        try {
            Socket socket = new Socket("172.30.1.84", 9999);
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            String path = "C:/Temp/image.png";
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);
            try (socket; os; bos; fis; bis) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
                System.out.println("파일이 전송 되었습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
