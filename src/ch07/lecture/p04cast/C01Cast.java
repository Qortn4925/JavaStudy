package ch07.lecture.p04cast;

public class C01Cast {
    public static void main(String[] args) {

        Parent1 o = new Child11(); // 자동 형변환  자식 >> 부모로

        Child12 child12 = new Child12(); //

        Parent1 q = child12;

        Child12 s = (Child12) q;     //안됨 >>  강제 형변환 캐스팅

        System.out.println("프로그램 종료");

    }
}

//@formatter:off
class  Parent1 {}

class Child11 extends  Parent1{

}

class Child12 extends  Parent1{}

//@formatter:on
