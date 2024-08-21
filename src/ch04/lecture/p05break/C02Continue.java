package ch04.lecture.p05break;

public class C02Continue {
    public static void main(String[] args) {
        // continue 코드 블럭 내의 나머지 코드를 실행하지 않고 반복문 진행
        // 조건이 a > a-1 실행 x > b 진행 ??
        boolean a = true;
        for (int i = 0; i < 5; i++) {

            System.out.println("위 명령문");
            if (a) {
                continue; //  그 밑에 코드 씹어버림
            }
            System.out.println("아래");

        }
    }
}
