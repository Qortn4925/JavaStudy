package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        
       // long var1 = 10000000000; >>  int형으로 인식
        long var2 = 10000000000L;
//        System.out.println("var1 = " + var1) ;   int로 인식해서 범위 오류
        System.out.println("var2 = " + var2); 
    }
}
