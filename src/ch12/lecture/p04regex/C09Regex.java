package ch12.lecture.p04regex;

public class C09Regex {
    public static void main(String[] args) {
        String s = "java is so easy!!! ,  Java is great";
        String replace1 = s.replace("java", "자바");
        System.out.println("replace1 = " + replace1);

        String s2 = replace1.replace("Java", "자바");
        System.out.print(s2);

        String r3 = s.replaceAll("[jJ][aA][vV][aA]", "자바");
        System.out.println("r3 = " + r3);

        System.out.println(s);
    }
}
