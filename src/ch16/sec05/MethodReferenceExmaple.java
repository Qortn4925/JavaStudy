package ch16.sec05;

public class MethodReferenceExmaple {
    public static void main(String[] args) {
        Person person = new Person();


        person.action(Computer::staticMethod);


        Computer com = new Computer();

        person.action(com::intanceMetohd);
    }
}









