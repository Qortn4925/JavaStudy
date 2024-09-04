package ch09.sec06.exam03;

public class Button {

    public static interface ClickListner {

        void onClick();

    }

    private ClickListner clickListner;

    public void setClickListner(ClickListner clickListner) {
        this.clickListner = clickListner;
    }

    public void click() {
        this.clickListner.onClick();
    }
}
