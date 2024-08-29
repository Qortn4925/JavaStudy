package ch07.lecture.p03polymorphism;

public class C09Polymorphism {

    public static void main(String[] args) {
        MyClass9 o1 = new MyClass9();
        o1.setNumber(new Integer(333));

        MyClass9 o2 = new MyClass9();
        o2.setNumber(new Double(3.14));

        o2.printDoubleNumber();
    }


}

class MyClass9 {
    private Number number;

    public void printDoubleNumber() {
        //인스턴스 필드로 객체를 생성했고 > 그 객체를 사용해 메소드 실행
        double b = number.doubleValue();

        System.out.println("b = " + b);
    }

    
    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}
