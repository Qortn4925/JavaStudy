package ch03.sec03;

public class LogicalOperatorExample {
    public static void main(String[] args) {
//        int charCode = 'A';
//        int charCode = 'a';
        int charCode = '5';
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자군요");
        }
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자구ㅇ");

        }

        
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9사이 수");
        }


    }
}
