package ch19.lecture.p01network;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) {
        //.. 기다리는 컴퓨터 > 서버

        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();   // 클라이언트의 연락 시도 시 socket 생성
            OutputStream os = socket.getOutputStream();
            try (os; socket; serverSocket) {
                os.write('Z');

                os.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
