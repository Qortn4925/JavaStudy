package ch02.lecture.p03String;

public class C01String {
    public static void main(String[] args) {
        char a = '가';
        System.out.println("a" + a);


        // char b = '가나'; //x
        //String : 여러 문자들(문자열)을 저장하는 타입
        String c = "가나"; // 큰 따오뮤ㅛ
        System.out.println("c = " + c);
        //String 의 큰따옴표안에서 큰 따옴표 표기하고 싶으면 \" \"   \+무언가를 하나의 문자로 봄
        String e = "It \"sdfdsf\" is";
        System.out.println("e = " + e);
        String d = " \\ ";
        System.out.println("d = " + d);
        // 역 슬래시 사용 예시   \'      \n > 다음 줄     \t >    tap키

    }
}
