package ch13.lecture.p01generic;

public class C02Generic {

    public static void main(String[] args) {
        Container2 box1 = new Container2();
        Container2 box2 = new Container2();
        box1.setItem("spring");
        box2.setItem(122);

        Object item1 = box1.getItem();
        Object item2 = box2.getItem();

        String s1 = (String) item1;
        Integer s2 = (Integer) item2;

//        String s3 = (String) item2;
        System.out.println("다음 코드");
    }
}

class Container2 {

    private Object item;


    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}