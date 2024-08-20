package ch03.lecture.p03compare;

public class C03String {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        // 크다 작다 할 수 없음
        // >> 왜냐면 참조값을 비교하
        //같다 같지 않다 할 수 있음
//         하지만 하면 안됨  >> 참조형이라서 그렇다 ~~
        System.out.println(a.equals(b));
    }


}
