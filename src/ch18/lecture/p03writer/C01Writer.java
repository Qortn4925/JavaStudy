package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01Writer {
    public static void main(String[] args) {
        String name = "C:/Temp/output21.txt";


        try (OutputStream os = new FileOutputStream(name)) {
            os.write(65);      //1 byte 쓰기  >> A  아스키 코드
            os.write('C');

            // 한글로 글자를 표현하려면 3BYTE가 필요하고> UTF ㅜ머시기로
            os.write(236);
            os.write(149);
            os.write(136);

            //  이러면  안이라고 출력 x  바이트 총량이 달라서 사라짐
            os.write('안');


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
