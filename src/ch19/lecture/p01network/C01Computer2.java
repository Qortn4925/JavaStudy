package ch19.lecture.p01network;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class C01Computer2 {
    public static void main(String[] args) throws IOException {
        // 연결 시도 >  클라이언트
        // 전화를 거는 쪽이 >   상대방의 번호를 알아야 하듯이 , 서버의 무언가를 알아야함
        //Socket  객체로  > 서로 소통


        try {
            // host 와 port번호
            Socket socket = new Socket("172.30.1.73", 9999);
            InputStream is = socket.getInputStream();
            try (is; socket) {


                int data = is.read();
                System.out.println((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
