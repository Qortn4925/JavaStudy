package ch07.lecture.p04cast;

public class C02Cast {
    public static void main(String[] args) {

        Parent2 p = new Child21();
        Child21 c = (Child21) p; // 문제없이 성ㄱㅇ

        Parent2 q = new Child22();

//        Child21 d = (Child21) q;  // 강제 형변환 인데 >  같은 위치에 있는 cast라 불가능 ,
        System.out.println("프로그램 종료 ");
    }
}


//@formatter:off
class Parent2 {}
class Child21 extends  Parent2{}
class Child22 extends  Parent2{}
