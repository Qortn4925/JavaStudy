package ch04.Exercise;

public class Sol06 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //별찍기 더 짧게 몬하나 , 흠,흠흠흠흠
        // 첫 줄엔 한게 , 두번째 줄엔 두개 3번째 줄엔 3개  4번째 줄엔 4개

        for (int i = 0; i < 5; i++) {      //이건 5번 밖에 안 함
            System.out.print("*");
        }
    }
}
