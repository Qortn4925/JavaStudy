package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] seanson = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("seanson[0] = " + seanson[0]);
        System.out.println("seanson[1] = " + seanson[1]);
        System.out.println("seanson[2] = " + seanson[2]);
        System.out.println("seanson[3] = " + seanson[3]);

        seanson[1] = "여름";
        System.out.println("seanson[1] = " + seanson[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];

        }
        System.out.println("총합" + sum);

        double avg = (double) sum / scores.length;
        System.out.println(avg + "평균");
    }
}
