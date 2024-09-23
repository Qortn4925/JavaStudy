package ch19.lecture.p01network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C02Computer1 {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            //socket에  라이터를 얻는 메소드가 없어서 ,
            OutputStream os = socket.getOutputStream();

            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bf = new BufferedWriter(osw);
            try (serverSocket; socket; os; osw; bf) {
                bf.write("안녕 클라이언트!!");
                bf.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
