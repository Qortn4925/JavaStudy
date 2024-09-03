package ch16.sec05.exam03;

public class ConstructorReferenceExmaple {
    public static void main(String[] args) {

        Person person = new Person();

        Member m1 = person.getMember1(new Createable1() {
            @Override
            public Member create(String id1) {
                return new Member(id1);
            }
        });

        Member m13 = person.getMember1(id1 -> new Member(id1));

        Member m11 = person.getMember1(Member::new);


        System.out.println(m1);

        System.out.println();

        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}










