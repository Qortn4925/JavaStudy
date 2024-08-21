package ch04.lecture.p02switch;

public class C08Break {
    public static void main(String[] args) {
        // 1 ~ 3
        int n = (int) (Math.random() * 3) + 1;
        System.out.println("n = " + n);

        switch (n) {
            case 1:
                System.out.println("1");
                //                break;    break 빼먹으면    1이 여도 > 2 의 브레이크 만남
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
        }
    }
}
