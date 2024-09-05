package ch16.exercise.sol3;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> c1 = new Container<>();
        c1.setA("홍길동", "도적");
        String name = c1.getA();
        String jov = c1.getB();


        Container<String, Integer> c2 = new Container<>();
        c2.setA("홍길동", 19);
        String name1 = c2.getA();
        int age = c2.getB();
    }
}
