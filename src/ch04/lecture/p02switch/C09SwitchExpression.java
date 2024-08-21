package ch04.lecture.p02switch;

public class C09SwitchExpression {
    public static void main(String[] args) {
        //switch expression  스위치  표현식

        // 스위치 표현식 x
        String message = "";

        String grade = "A";
        switch (grade) {
            case "A", "a" -> {
                message = "우수등급";

            }
            case "B", "b" -> {
                message = "중간 등급";
            }
            case "C", "c" -> {
                message = "등급 미만";
            }
        }
        System.out.println(message);
    }
}
