package ch04.lecture.p04for;

public class C05Gugudan {
    public static void main(String[] args) {

        // 9~2
        for (int j = 9; j >= 2; j--) {
            System.out.println(j + "단 입니다");
            for (int i = 1; i <= 9; i++) {
                System.out.println(STR."\{j}x \{i}= \{j * i}");
            }
            System.out.println("------------------------");
        }

    }

}
