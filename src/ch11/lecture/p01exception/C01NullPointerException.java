package ch11.lecture.p01exception;

public class C01NullPointerException {
    public static void main(String[] args) {
        //NullPointerException

        String s = "java";
        System.out.println(s.length());
        System.out.println("다음 코드");

        String t = null;
        System.out.println(t.length());
    }
}
