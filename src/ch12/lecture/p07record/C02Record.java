package ch12.lecture.p07record;

public class C02Record {

    public static void main(String[] args) {
        Book2 b1 = new Book2("java", "shin", 3000);
        Book2 b2 = new Book2("java", "shin", 3000);
        Book2 b3 = new Book2("g", "abn", 5000);

        //getter에 get 을 제거하고 , 그냥 필드명
        System.out.println(b1.title());
        System.out.println(b2.title());
        System.out.println(b3.title());

        System.out.println(b1.toString());
        System.out.println(b2.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b1.equals(b2));
    }
}

record Book2(
        String title,
        String author,
        int pirce
) {

}
