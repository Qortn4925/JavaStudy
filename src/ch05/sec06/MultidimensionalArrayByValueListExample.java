package ch05.sec06;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = new int[][]{{80, 90, 96}, {76, 88}};

        System.out.println(scores.length + "배열 길이");
        System.out.println(scores[0].length + "1행 길이");
        System.out.println(scores[1].length + "2행 길이");

        System.out.println(scores[0][2] + "1반 3번째 학생");
        System.out.println(scores[1][1] + "2반 2번째 학생");
        int classSum = 0;

        for (int i = 0; i < scores[0].length; i++) {
            classSum += scores[0][i];
        }
        double classAvg = (double) classSum / scores[0].length;
        System.out.println("classAvg = " + classAvg);

        classSum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            classSum += scores[1][i];
        }
        classAvg = (double) classSum / scores[1].length;
        System.out.println("classAvg = " + classAvg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }

        }

        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 평균= " + totalAvg);
    }

}



