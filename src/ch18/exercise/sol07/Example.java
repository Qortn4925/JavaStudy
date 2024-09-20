package ch18.exercise.sol07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {

        try {
            String name = "src/ch02/sec02/PrintExample.java";
            FileReader fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);

            try (fr; br) {
                int lineNo = 0;

                String rowData;

                while (true) {
                    rowData = br.readLine();
                    if (rowData == null) break;

                    System.out.println(lineNo + "\t" + rowData);
                    lineNo++;

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
