package ch07.sec09;

public class Student extends Person {
    public int studnetNo;

    public Student(String name, int studnetNo) {
        super(name);
        this.studnetNo = studnetNo;
    }

    public void study() {
        System.out.println("공부를 합니다");
    }

}
