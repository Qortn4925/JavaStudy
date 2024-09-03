package ch16.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person p = new Person();

        p.ordering(String::compareToIgnoreCase);
        //string s니까 s.comparetoignorecase 를 사용하겠다
        p.ordering((s, str) -> s.compareToIgnoreCase(str));
    }
}
