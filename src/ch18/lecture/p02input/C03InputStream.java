package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class C03InputStream {
    public static void main(String[] args) {

        String name = "C:/Temp/output6.txt";

        try (InputStream is = new FileInputStream(name)) {
            byte[] data = new byte[5]; // 길이가 5인 바이트 배열
            System.out.println(Arrays.toString(data));   //


            is.read(data);
            System.out.println(Arrays.toString(data));

            is.read(data);
            System.out.println(Arrays.toString(data));

            is.read(data);  //  13개 중 10개를 읽고 ,3개만 불러와서 ,뒤에 두개는 > 배열의 요소가 초기화 되지 않음 > 그래서 그전 9,10을 가져옴
            System.out.println(Arrays.toString(data));


        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
