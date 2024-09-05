package ch16.exercise.sol3;

public class Container<T1, T2> {
    T1 a;
    T2 b;

    public T1 getA() {
        return a;
    }

    public void setA(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T2 getB() {
        return b;
    }


}
