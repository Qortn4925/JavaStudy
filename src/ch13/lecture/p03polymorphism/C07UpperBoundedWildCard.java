package ch13.lecture.p03polymorphism;

public class C07UpperBoundedWildCard {


    public static void main(String[] args) {
        var b1 = new Box7<String>();
        var b2 = new Box7<Integer>();
        var b3 = new Box7<Long>();
        var b4 = new Box7<Double>();

//        printItme(b1);
        printItme(b2);
        printItme(b3);
        printItme(b4);
    }

    //      Number 하입 타입만 가능
    static void printItme(Box7<? extends Number> box7) {
        //꺼낸 값(in)이 특정 타입으로 결정하고 싶은 경우 사용
        //lowerboundedwildcard
        Number item = box7.getItem();
        //도달할수 있는 계층 구조 최고가 number라  uppper boundedwildcard
        item.doubleValue();
        item.longValue();
    }
}

class Box7<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
