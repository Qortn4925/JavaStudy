package ch04.lecture.p02switch;

public class C07CurlyBracket {
    public static void main(String[] args) {
        //  if , else if,  else , case 
        //  의 코드 블럭이 한 줄이면 중괄호 생략 가능
        // ( 단 중괄호 생략 시 코드 읽기 어려우면 생략 xx)

        if (true)
            System.out.println("ㅋㅋㅋㅋ");

        if (true) {
            System.out.println("!");
            System.out.println("!");
        }
//        if (true)
//            System.out.println("!");
//        System.out.println("!");


        if (true)
            System.out.println("1");
        else if (true)
            System.out.println("2");
        else
            System.out.println("3");

        int n = 3;
        switch (n) {
            case 1 -> System.out.println("!");
        }
    }

}
