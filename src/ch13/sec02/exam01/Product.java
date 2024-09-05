package ch13.sec02.exam01;

public class Product<K, M> {
    private K kidn;
    private M model;

    public K getKidn() {
        return kidn;
    }

    public void setKidn(K kidn) {
        this.kidn = kidn;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
