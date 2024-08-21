package ch04.lecture.p02switch;

public class C12SwitchExpression {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 3) + 1;

        String g = switch (n) {
            case 1 -> "일";
            case 2 -> {
                String a = "이";
                String b = "등급";
                yield a + b;     // 여러 명령문 작성후 값 산출 시   마지막에 넣어주고 싶은 값을  yield 문으로
            }
            case 3 -> "삼";
            default -> "그 외";
        };
    }
}
