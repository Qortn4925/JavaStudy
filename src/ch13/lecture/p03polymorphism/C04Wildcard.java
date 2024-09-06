package ch13.lecture.p03polymorphism;

public class C04Wildcard {
    public static void main(String[] args) {
        var b1 = new Box4<String>();
        var b2 = new Box4<Long>();
        var b3 = new Box4<Object>();
//        printItme(b1);
//        printItme(b2);
        printItme(b3);


    }

    static void printItme(Box4<Object> param) {
        Object item = param.getItem();

        System.out.println("item = " + item);
    }
}

// wildcard :parameter , return

class Box4<T> {
    private T item;


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
