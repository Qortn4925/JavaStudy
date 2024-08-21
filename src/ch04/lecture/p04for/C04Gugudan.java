package ch04.lecture.p04for;

public class C04Gugudan {
    public static void main(String[] args) {
        // 홀수 단만 출력
        for (int j = 3; j <= 9; j = j + 2) {
            System.out.println(j + "단 입니다");
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j}x \{i}= \{j * i}");
            }
            System.out.println("------------------------");
        }
    }
}
