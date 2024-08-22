package ch04.Exercise;

public class Sol63 {
    public static void main(String[] args) {
          /*
        0
        1
        2
        3
        4
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");

        /*
        4
        3
        2
        1
        0
         */
        for (int i = 4; i <= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-----------");
        /*
        1
        2
        3
        4
        5
         */
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");
        /*
        5
        4
        3
        2
        1
         */
        for (int i = 5; i <= 1; i--) {
            System.out.println(i);
        }
        System.out.println("-----------");

        /*
        0
        01
        012
        0123
        01234
         */
        String j = "";
        for (int i = 0; i < 5; i++) {

            j = j + i;
            System.out.println(j);

        }
        System.out.println("---------");
        /*
        1
        12
        123
        1234
        12345
         */
        j = "";
        for (int i = 1; i < 6; i++) {

            j = j + i;
            System.out.println(j);

        }
        System.out.println("--------------");

        /*

         *****
         ****
         ***
         **
         *

         */
        for (int k = 5; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------");
        /*

        0
        12
        345
        6789
        01234

         */
        int hap = 0;

        for (int k = 0; k < 5; k++) {

            for (int i = 0; i <= k; i++) {

                if (hap > 9) {
                    hap = 0;
                    System.out.print(hap);
                } else {
                    System.out.print(hap);
                }
                hap = hap + 1;
            }
            System.out.println();

        }

//        hap = 0;
//        j = "";
//        for (int k = 0; k < 5; k++) {
//            j = j + hap;
//            System.out.println(j);
//            hap++;
//        }
    }
}
