package ch13.lecture.p03polymorphism;

public class C08LowerBoundedWildcard {

    public static void main(String[] args) {
        var b1 = new Box8<Number>();
        var b2 = new Box8<Object>();
        var b3 = new Box8<Long>();

        addItmes(b1);
        addItmes(b2);
//        addItmes(b3); // 입력 한도를 넣어논거임

        Number a = 1;


    }

    static void addItmes(Box8<? super Number> box) {

        //? > 뭐든 올 수 있어서 object로
//        Object il = box.getItem();
//        Number i2 = box.getItem(); //  값을 받을때는  무조건 , number으 하위 타입 또는 number라 상관 없는데
        box.setItem(1);   //>> 넣을때는 , int , double, long 중 뭐가 들어올지 모르기때문에   extends x
//아까는 extends로 상위 범위를 제한했기 때문에 출력받는건 상관없음
        // 이번엔 , 하위 범위를 number로 제한했기 때문에 ,Number가 트리 구조 젤 하위라 ,  위에것도 넣어도 상관 없는거 ,걍 위치가 바뀐거 같은데
        box.setItem(3.5);
        
    }
}

class Box8<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
