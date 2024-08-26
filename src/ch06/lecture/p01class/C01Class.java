package ch06.lecture.p01class;

public class C01Class {
    // p209
    public static void main(String[] args) {


        String a = new String("JAVA");
        var b = new MyClass();
        var c = new MyClass();

        int codea = System.identityHashCode(a);
        int codeb = System.identityHashCode(b);
        int ocdec = System.identityHashCode(c);


        System.out.println("ocdec = " + ocdec);
        System.out.println("ocdec = " + codea);
        System.out.println("codeb = " + codeb);
    }
}


// class(설계도) 만들기

class MyClass {

}
