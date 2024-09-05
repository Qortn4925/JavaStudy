package ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKidn(new Tv());
        product1.setModel("스마트 모델");

        Tv tv = product1.getKidn();
        String tvmodel = product1.getModel();

        Product<Ca, String> pr2 = new Product<>();
        pr2.setModel("현대");
        pr2.setKidn(new Ca());

        Ca ca2 = pr2.getKidn();
        String camodel = pr2.getModel();


    }
}
