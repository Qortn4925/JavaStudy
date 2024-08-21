package ch04.lecture.p01if;

public class C04Nested {
    public static void main(String[] args) {
        //제어문 내에 제어문 작성 가능 , 복잡한 흐름 만들수 있다!
        if (true) {
            System.out.println("1");

            if (true) {
                System.out.println("2");
                System.out.println("3");
            } else {
                System.out.println("4");
            }
            System.out.println("5");
        }
        System.out.println("6");
        System.out.println("7");
    }
}
