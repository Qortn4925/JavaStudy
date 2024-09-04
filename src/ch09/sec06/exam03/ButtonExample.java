package ch09.sec06.exam03;

import ch08.sec10.exam01.B;
import ch08.sec10.exam01.C;

public class ButtonExample {

    public static void main(String[] args) {
        Button button = new Button();

        class OkListenr implements Button.ClickListner {
            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭");
            }

        }

        button.setClickListner(new OkListenr());

        button.click();

        button.setClickListner(() -> System.out.println("ok 버튼을 클릭1"));
        button.click();


        Button btnCancle = new Button();

        class CancleListner implements Button.ClickListner {
            @Override
            public void onClick() {
                System.out.println("캔슬 버튼을 클릭");
            }
        }
        btnCancle.setClickListner(new CancleListner());
        btnCancle.click();

        btnCancle.setClickListner(() -> System.out.println("캔슬 버튼을 클릭2"));
        btnCancle.click();

    }
}
