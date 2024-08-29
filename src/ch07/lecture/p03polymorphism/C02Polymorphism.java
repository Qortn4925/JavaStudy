package ch07.lecture.p03polymorphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        Child02 c02 = new Child02();
        Parent02 p02 = c02;
        ParentParent02 papa02 = p02;

        //  papa02 =  c02;

        ParentParent02 papap03 = new Child02();
        Parent02 p021 = new Child03();
        Parent02 p022 = new Child02();

//        Child02 c021 = new Child03()// >> 이거는 오류

    }

}

class ParentParent02 {
}

class Parent02 extends ParentParent02 {


}

class Child02 extends Parent02 {

}

class Child03 extends Parent02 {

}