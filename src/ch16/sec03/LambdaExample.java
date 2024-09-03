package ch16.sec03;

import ch16.sec03.Person;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 합니다");
        });
        person.action1(((name, job) -> System.out.println("dsdsdsdsd")));

        person.action2((word) -> {
            System.out.println(word);
            System.out.println("라고 말을 합니다.");
        });

        person.action2(word -> System.out.println(word));

    }
}
