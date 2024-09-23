package ch19.lecture.p01network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class C05Client {
    public static void main(String[] args) throws Exception {

        // 키보드 입력을 server 로 보내기
        //키보드로 부터 입력 받고 ,

        Socket socket = new Socket("172.30.1.84", 9999);
        System.out.println(" 연결됨 !!");

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        PrintStream ps = new PrintStream(bos);


        // socket 은  프로그램 기준 나가니까  output
        Scanner sc = new Scanner(System.in);
        try (sc; ps; bos; socket) {
            System.out.println("이름입력 >");
            String name = sc.nextLine();
            ps.println(name);

            ps.flush();
            while (true) {
                System.out.print(">>:");
                String input = sc.nextLine();
                if (input.equals("종료")) {
                    break;
                }
                ps.println(input);
                ps.flush();
            }

            System.out.println("종료 !!!!!");
        }
    }
}
