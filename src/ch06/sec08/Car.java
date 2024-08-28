package ch06.sec08;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없");
            return false;
        }
        System.out.println("gas가 있" + gas);
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. gas잔량" + gas);
            } else {
                System.out.println("멈춤 잔량:" + gas);
                return;
            }


        }
    }
}
