package ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        //action 은 인터페이스 칼큘 을 받아서 , 추상메소드를 실행하는 코드임
        //하지만 추상메소드가 구현이 되어있지 안흥ㄴ데
        // a그래서 라마로 작성
        action((x, y) -> {
            int result = x + y;
            System.out.println("result = " + result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });


    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x, y);
    }
}
