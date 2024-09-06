package ch13.lecture.p03polymorphism;

public class C05Wildcard {
    public static void main(String[] args) {

        Box5<String> b1 = new Box5<>();

        // 만약 이게 가능 하면
//        Box5<Object> b2 = new Box5<String>();
//        b2.setItem(new Object());

        //? :wildcard
        Box5<?> b3 = new Box5<String>();
        Box5<?> b4 = new Box5<Integer>();

//        var b5 = new Box5<String>();


    }
}


class Box5<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
