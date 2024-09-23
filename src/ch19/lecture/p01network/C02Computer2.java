package ch19.lecture.p01network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class C02Computer2 {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("172.30.1.9", 9999);

            InputStream is = socket.getInputStream();

            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            try (socket; is; isr; br;) {
                String s = br.readLine();
                System.out.println("s = " + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


