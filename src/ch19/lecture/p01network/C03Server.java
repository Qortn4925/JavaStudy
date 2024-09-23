package ch19.lecture.p01network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Server {
    public static void main(String[] args) {

        //클라이언트가 파일 보내는거
/*
        try {
            String path = "C:/Temp/copy.png";
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            FileOutputStream fos = new FileOutputStream(path);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            InputStream is = socket.getInputStream();
            BufferedInputStream ibs = new BufferedInputStream(is);
            try (serverSocket; socket; fos; bos; is; ibs) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = ibs.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
                System.out.println("파일 전송 완료 !");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();


            // 서버가 파일 보낼려면 , 파일을 복사해야함 > 파일이 프로그램에 들어오니까 input >
            String path = "C:/Temp/copy2.png";
            FileInputStream fis = new FileInputStream(path);
            BufferedInputStream bis = new BufferedInputStream(fis);


            // 서버는 파일을 내보낼거니까 output
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (serverSocket; socket; fis; bis; os; bos) {
                byte[] data = new byte[1000];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
                System.out.println("파일 전송 완료");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
