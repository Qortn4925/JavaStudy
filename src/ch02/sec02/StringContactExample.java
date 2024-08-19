package ch02.sec02;

public class StringContactExample {
    public static void main(String[] args) {
        //숫자 연산

        int result = 10 + 2 + 7;
        System.out.println("result = " + result);

        String result2 = 10 + 2 + "8";
        System.out.println("result2 = " + result2);
        String result3 = 10 + "2" + 8;
        System.out.println("result3 = " + result3);
        String res4 = "10" + 2 + 8;
        System.out.println("res4 = " + res4);
        String re5 = "10" + (2 + 8);
        System.out.println("re5 = " + re5);
    }
}
