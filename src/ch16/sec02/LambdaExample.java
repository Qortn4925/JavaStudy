package ch16.sec02;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //람다는  매개변수에 인스턴스 값을 넣고  하는걸 생략하기 위해서 하는거임
        // 그니까   매개변수 넣는곳에 구현하는거  > 인스턴스가 해야하는 정보를 대신 입력해준다는 느낌?
        person.action(() -> {
            System.out.println("출근");
            System.out.println("프로그래밍");
        });


        person.action(() -> System.out.println("퇴근"));
    }


}
