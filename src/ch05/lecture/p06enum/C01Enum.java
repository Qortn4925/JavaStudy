package ch05.lecture.p06enum;

public class C01Enum {


    public static void main(String[] args) {
        int season = Enum1.FALL;

        if (season == Enum1.FALL) {
            System.out.println("가을 관련 코드");
        }
    }

}


class Enum1 {
    public static final int SPRING = 1;
    public static final int SUMMER = 2;
    public static final int FALL = 3;
    public static final int WINTER = 4;
}
