package ch04.Exercise;

public class Sol05 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        for (x = 0; x < 11; x++)
            for (y = 0; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println(x + "," + y);
                }
                
            }
    }
}
