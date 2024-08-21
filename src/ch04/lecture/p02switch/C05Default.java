package ch04.lecture.p02switch;

public class C05Default {
    public static void main(String[] args) {
        // 1~10 (정수)
        int n = (int) (Math.random() * 10) + 1;
        System.out.println();

        //default >  이프문의 else ? 같은 느낌

        switch (n) {
            case 5, 10 -> {
                System.out.println("5의 배수");

            }
            case 3, 6, 9 -> {
                System.out.println("3의 배수 입니다.");
            }
            default -> {
                System.out.println("2의 배수 입니다.");
            }


        }

        switch (n) {
            case 5:
            case 10:
                System.out.println("5의 배수");
                break;
            case 3:
            case 6:
            case 9:
                System.out.println("3의배수");
                break;
            default:
                System.out.println("그 외");
                break;
        }
    }
}
