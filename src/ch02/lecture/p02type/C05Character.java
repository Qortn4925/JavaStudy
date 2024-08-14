package ch02.lecture.p02type;

public class C05Character {
    public static void main(String[] args) {
        //char (2byte)
        // 문자 하나
        // unicode 숫자와 문자 매칭 표  > 16진법
        char a = 'a';
        char b = '가';
        char c = '한';
        char d = '8';
        char f = 65;
        char i = '\u0e9f';
        char j = ' ';  // >> 공백도 x
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("a = " + a);

    }
}
