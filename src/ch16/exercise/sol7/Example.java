package ch16.exercise.sol7;

public class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);

        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x, y) -> {
            if (x > y)
                x = x;
            else
                x = y;

            return x;
        });

        System.out.println("최댓값" + max);

        int min = maxOrMin((x, y) -> {
            if (x < y)
                x = x;
            else
                x = y;
            return x;
        });
        System.out.println("최솟값 " + min);
    }
}
