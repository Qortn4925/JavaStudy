package ch19.lecture.p01network;

import java.io.*;
import java.net.Socket;

public class C03Client {
    public static void main(String[] args) {


        // 클라이언트가 파일 보내는거
/*
        try {
            Socket socket = new Socket("172.30.1.73", 9999);

            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            String fileName = "C:/Temp/image.png";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            try (socket; os; bos; fis; bis;) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
                System.out.println("파일 보내기 완료");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
  */
        // 클라이언트가 파일 받는거

        try {
            Socket socket = new Socket("172.30.1.73", 9999);

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String fileName = "C:/Temp/image123123.png";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (socket; fos; bos; is; bis) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
                System.out.println("파일 받기 완료 !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
