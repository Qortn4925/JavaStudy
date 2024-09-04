package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2))
            System.out.println("obj1 , 2 는 동일");
        else
            System.out.println("같지 않음");

        if (obj1.equals(obj3)) {
            System.out.println("1,3은 동일");

        } else
            System.out.println("같지 않음");
    }
}
