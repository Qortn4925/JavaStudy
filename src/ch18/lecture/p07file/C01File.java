package ch18.lecture.p07file;

import java.io.File;

public class C01File {

    public static void main(String[] args) {

        //File 객체

        String path = "src/ch18/lecture/p07file/C01File.java";
        File f1 = new File(path);

        long length = f1.length();
        boolean exits = f1.exists();
        boolean directory = f1.isDirectory();
        String absolpath = f1.getAbsolutePath();

        
        System.out.println("f1 = " + f1);
        System.out.println("length = " + length);
        System.out.println("exits = " + exits);
        System.out.println("directory = " + directory);
        System.out.println("absolpath = " + absolpath);
    }
}
