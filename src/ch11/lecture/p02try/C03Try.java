package ch11.lecture.p02try;

public class C03Try {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            System.out.println("a = " + a);
            // try 문에서도 오류 발생전까지는 출력
            int c = a / b;


            // try 블럭 내의 다음 코드들 ...
            System.out.println("c = " + c);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println(" 다음 코드들");
    }
}
