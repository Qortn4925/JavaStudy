package ch12.lecture.p07record;


//record 가 없던 시절
public class C01Record {
    public static void main(String[] args) {
        Book1 b1 = new Book1("java", "shin", 3000);
        Book1 b2 = new Book1("git", "linux", 5000);
        Book1 b3 = new Book1("git", "linux", 5000);

        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getTitle());
    }
}

class Book1 {
    private String title;
    private String author;
    private int price;

    public Book1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
