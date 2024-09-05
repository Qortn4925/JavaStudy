package ch13.lecture.p01generic;

public class C01Generic {
    public static void main(String[] args) {
        StringContainer1 container = new StringContainer1();
        container.setItem("java");
        System.out.println(container.getItem());

        IntegerContainer1 box = new IntegerContainer1();
        box.setItem(122);
        System.out.println(box.getItem());
        
    }
}

class IntegerContainer1 {

    private Integer item;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}

class StringContainer1 {

    private String item;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
