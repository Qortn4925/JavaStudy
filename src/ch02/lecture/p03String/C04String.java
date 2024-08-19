package ch02.lecture.p03String;

public class C04String {
    public static void main(String[] args) {
        // + : 문자열 연결 연산자
        String a = "길동";
        String b = "의적";
        String c = b + a;  // 의적길동

        System.out.println("c = " + c);
        String d = "3";
        String e = "5";
        String f = d + e;
        System.out.println("f = " + f);

        String g = "흥민";
        String h = "토트넘";
        String i = g + "의 팀은 " + h + "입니다";
        System.out.println("i = " + i);
        //다른 타입과 +로 연결 연산
        String j = "3" + 5;
        String k = 5 + "3";
        String l = 5 + 3 + "0"; // 80
        System.out.println("l = " + l);
    }
}
