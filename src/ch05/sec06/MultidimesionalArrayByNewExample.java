package ch05.sec06;

public class MultidimesionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScore = new int[2][3];
        for (int i = 0; i < mathScore.length; i++) {
            for (int k = 0; k < mathScore[i].length; k++) {
                System.out.println(mathScore[i][k]);

            }
        }

        System.out.println();

        mathScore[0][0] = 80;
        mathScore[0][1] = 83;
        mathScore[0][2] = 85;
        mathScore[1][0] = 86;
        mathScore[1][1] = 90;
        mathScore[1][2] = 92;
        int totlaStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScore.length; i++) {
            totlaStudent += mathScore[i].length;
            for (int k = 0; k < mathScore[i].length; k++) {
                totalMathSum += mathScore[i][k];
            }

        }
        double totalMathAvg = (double) totalMathSum / totlaStudent;
        System.out.println("전제 학생의 수학 평균" + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println(englishScores[i][k]);
            }
        }

        System.out.println();
        englishScores = new int[][]{{90, 91, 92}, {93, 94}};
        totlaStudent = 0;
        totalMathSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totlaStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalMathSum += englishScores[i][k];
            }

        }
        double totalEnligshAvg = (double) totalMathSum / totlaStudent;

        System.out.println("영어 평균" + totalEnligshAvg);
    }
}
