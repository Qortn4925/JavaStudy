package ch03.exercise;

public class Sol01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
//        int z = (++x) + (y++);      //31

        ++x;
        y++;
        int z = x + y;
        System.out.println("z = " + z);
    }
}
