package ch12.lecture.p07record;

public class C03Record {
    public static void main(String[] args) {

        Book3 b1 = new Book3("java", 1100);
        b1.method1();

        // 그냥 클래스 객체라고 인식함 , > Object를 상속 받는
        System.out.println(b1 instanceof Object);
    }
}

// 클래스와 비슷하게 작성 ㄱ ㄱ

// equals, hashcode, to string 메소드가 이미 재정의 되어 있음
record Book3(
        String title,
        int price
) {
    public void method1() {
        System.out.println("Book3.method1");
    }
}
