package ch12.exercise.sol12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 400;

        //true
        System.out.println(obj1 == obj2);
        //false
        System.out.println(obj3 == obj4);
    }
}
