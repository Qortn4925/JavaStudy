package ch07.lecture.p04cast;

public class C05InstanceOF {
    public static void main(String[] args) {
        A a = new B();

        if (a instanceof B b) {
            //B의  메소드 실행..
        }

        if (a instanceof C c) {
            //c의 메소드 실행
        }

        
    }
}
