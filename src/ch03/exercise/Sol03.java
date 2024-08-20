package ch03.exercise;

public class Sol03 {
    public static void main(String[] args) {
        int pen = 534;
        int students = 30;

        int penPerS = (pen / students);
        System.out.println("penPerS = " + penPerS);
        int spp = (pen % students);
        System.out.println("spp = " + spp);

    }
}
