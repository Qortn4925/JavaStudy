package ch04.lecture.p01if;

public class C03ElseIf {
    public static void main(String[] args) {
        if (true) {
            System.out.println("1");
        } else if (true) {    //  if가   false+  else if 절이 참이어야 2, 3, 이 실행
            // if 절  else if   , else 절에서 else 는 모두 false일때
            System.out.println("2");
            System.out.println("3");
        }

        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }
}
