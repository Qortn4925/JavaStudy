package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;

public class FileExample {
    public static void main(String[] args) throws IOException {

        File dir1 = new File("C:/Temp/images");
        File dir2 = new File("C:/Temp/file2.txt");
        File dir3 = new File("C:/Temp/file3.txt");
        File dir4 = new File("C:/Temp/file4.txt");

        if (dir1.exists() == false) dir1.mkdirs();
        if (dir2.exists() == false) dir2.createNewFile();
        if (dir3.exists() == false) dir3.createNewFile();
        if (dir4.exists() == false) dir4.createNewFile();

        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH :mm");
        for (File file : contents) {
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
