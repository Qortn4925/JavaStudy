package ch07.lecture.p04cast;

public class C03Instanceof {
    public static void main(String[] args) {
        Parent3 a = new Child31();


        //True
        if (a instanceof Child31) {
            Child31 B = (Child31) a;
        }
        //False
        if (a instanceof Child32) {
            Child32 c = (Child32) a; // x
        }
    }
}

//@formatter:off;
class Parent3{}
class Child31 extends  Parent3{}
class Child32 extends  Parent3{}
