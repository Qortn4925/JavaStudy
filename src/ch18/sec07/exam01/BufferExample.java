package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {

    public static void main(String[] args) throws IOException {
        String originalFilePath1 = "C:/Temp/image.png";

        String tagetpath = "C:/Temp/copy.png";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(tagetpath);


        String getOriginalFilePath2 = "C:/Temp/image.png";
        String targetpath2 = "C:/Temp/copy2.png";

        FileInputStream fis2 = new FileInputStream(getOriginalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetpath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼미사용" + nonBufferTime);

        long time = copy(bis, bos);
        System.out.println("time = " + time);

        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }

    public static long copy(InputStream is, OutputStream os) throws IOException {

        long start = System.nanoTime();

        while (true) {
            int data = is.read();

            if (data == -1) break;
            os.write(data);

        }
        os.flush();
        long end = System.nanoTime();

        return end - start;
    }
}
