package ch09.lecture.sec07.exam01;

public class Car {
    private Tire tire = new Tire();

    private Tire tire2 = new Tire() {

        @Override
        public void roll() {
            System.out.println("익명 자식 타이어 객체 1 이 굴러갑니다");
        }
    };

    public void run1() {
        tire.roll();
        tire2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 타이어객체 2가 굴러갑니다");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
