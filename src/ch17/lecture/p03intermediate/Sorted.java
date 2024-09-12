package ch17.lecture.p03intermediate;


import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {

        List<Bokk> list = List.of(
                new Bokk("java", 500),
                new Bokk("git", 300),
                new Bokk("css", 700),
                new Bokk("spring", 100),
                new Bokk("react", 200)
        );

        list.stream()
                .sorted((b1, b2) -> b1.getPrice() - b2.getPrice())
                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.comparingInt(Bokk::getPrice))
                .forEach(System.out::println);


        list.stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .forEach(System.out::println);

    }


}


class Bokk {
    private String title;
    private int price;

    public Bokk(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bokk{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
