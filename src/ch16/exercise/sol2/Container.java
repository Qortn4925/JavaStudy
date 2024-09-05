package ch16.exercise.sol2;

public class Container<T> {
    T field;

    public T get() {
        return field;
    }

    public void set(T field) {
        this.field = field;
    }
}
