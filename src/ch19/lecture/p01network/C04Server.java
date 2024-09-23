package ch19.lecture.p01network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class C04Server {

    public static void main(String[] args) throws IOException {
        // 클라이언트가 보낸 파일 받기

        AtomicInteger number = new AtomicInteger(0);


        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            System.out.println("파일 받기를 기다리는 중");
            Socket socket = serverSocket.accept();
            Thread t = new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    BufferedInputStream bis = new BufferedInputStream(is);
                    int n = number.incrementAndGet();

                    String path = "C:/Temp/image111" + n + ".png";
                    FileOutputStream fos = new FileOutputStream(path);
                    BufferedOutputStream bos = new BufferedOutputStream(fos);

                    try (socket; is; bis; fos; bos) {
                        byte[] data = new byte[1000];
                        int len = 0;
                        while ((len = bis.read()) != -1) {
                            bos.write(data, 0, len);
                        }
                        bos.flush();
                    }// with 뭐시기 끝
                }  // 트라이 끝
                catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            t.start();
        }

    }


}
