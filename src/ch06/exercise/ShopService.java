package ch06.exercise;


public class ShopService {

    private static ShopService s = new ShopService();

    private ShopService() {

    }

    public static ShopService getInstance() {

        return s;
    }

    public static void main(String[] args) {
        ShopService S1 = ShopService.getInstance();
        ShopService S2 = ShopService.getInstance();

        if (S1 == S2) {
            System.out.println(" 같은 객체");
        } else {
            System.out.println("다른 객체");
        }


        int k = 6;
        System.out.println(k % 3);
    }


}