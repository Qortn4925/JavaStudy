package ch05.sec04;

public class NullPointerException {
    public static void main(String[] args) {
        int[] intarray = null;

        intarray[0] = 10;
        //System.out.println(intarray[0]);
        String str = null;

        System.out.println("총 문자 수" + str.length());
    }
}
