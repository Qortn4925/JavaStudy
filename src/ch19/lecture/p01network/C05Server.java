package ch19.lecture.p01network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C05Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9999);

        try (serverSocket) {
            while (true) {
                Socket socket = serverSocket.accept();
                Thread thread = new Thread(() -> {
                    try {
                        InputStream is = socket.getInputStream();
                        InputStreamReader isr = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(isr);

                        try (socket; serverSocket; is; isr; br) {
                            String line = null;
                            String name = br.readLine();

                            System.out.println(name + "님 접속");
                            while ((line = br.readLine()) != null) {
                                System.out.println(name + ">" + line);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            }

        }
    }
}
