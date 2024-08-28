package ch06.sec07;

public class KoreanExample {

    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "012-235235-121");
        System.out.println(k1.nation);
        System.out.println(k1.son);

        Korean k2 = new Korean("낄낄이", "0123=2242=");
        System.out.println(k2.nation);
        System.out.println(k2.son);

    }
}
