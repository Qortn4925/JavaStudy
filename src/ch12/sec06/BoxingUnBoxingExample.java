package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer obj = 100;
        System.out.println("obj.intValue() = " + obj.intValue());

        int value = obj;
        System.out.println("value = " + value);

        //자동언박싱해서 계산되서 넘어감
        int result = obj + 100;
        System.out.println("result = " + result);
    }
}
