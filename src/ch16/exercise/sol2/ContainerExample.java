package ch16.exercise.sol2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container = new Container<String>();
        container.set("홍길동");
        String str = container.get();

        Container<Integer> container1 = new Container<Integer>();
        container1.set(100);
        int a = container1.get();
        

    }
}
