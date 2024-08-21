package ch04.lecture.p02switch;

public class C10SwitchExpression {
    public static void main(String[] args) {
        String grade = "A";

        String message = switch (grade) {
            case "A", "a" -> "우수등급";

            case "B", "b" -> "중간 등급";

            case "C", "c" -> "등급 미만";

            default -> ""; // 생략 불가
        };


    }
}
