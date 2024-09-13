package ch11.lecture.p02try;

public class C01Try {
    public static void main(String[] args) {

        try {
            // exceptio이 발생할 것 같은 코드 들
            int a = 3;
            int b = 0;
            // 아리스메틱 오루
            int c = a / b;  // 오류 발생시 > 객체가 생성됨 >  클래스가 있음

        } catch (Exception e) {
            // exception 객체로 어떤 일을 함.
            
        }

        System.out.println("다음 코드");
    }
}
