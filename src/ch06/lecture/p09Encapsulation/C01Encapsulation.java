package ch06.lecture.p09Encapsulation;

public class C01Encapsulation {

    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        //o.age = 9;
        o.setAge(9);
        int n = o.getAge();
        System.out.println("n = " + n);
        o.setAge(-1);
    }


}


class MyClass01 {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else
            this.age = age;

    }

    public int getAge() {
        return this.age;
    }

}
