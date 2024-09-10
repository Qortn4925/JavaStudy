package ch15.lecture.p05compare;

import ch08.sec10.exam01.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Sort {
    public static void main(String[] args) {

        List<Book2> book2 = new ArrayList<>();
        book2.add(new Book2("java", 500));
        book2.add(new Book2("git", 600));
        book2.add(new Book2("react", 300));
        book2.add(new Book2("spring", 700));
        book2.add(new Book2("vue", 400));

        book2.forEach(System.out::println);

        Collections.sort(book2);
        //가격을 기준으로 해서 가격 기준 정렬 됨 작은거 ~ 큰
        System.out.println("-정렬후-");
        book2.forEach(System.out::println);

    }
}

//Collections 에는 sort 메소드가 있지만  숫자가 아니거나 ,  정렬 기준을 바꾸고 싶다면
//Comparable 인터페이스를 사용해야함 > compareTo라는 추상 메소드를 가지는디
class Book2 implements Comparable<Book2> {
    private String title;
    private int price;

    //생성자 , getter ,setter , tostring
    public Book2(String title, int price) {
        this.title = title;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book2 o) {
        // 음수  매개변수보다 작은값 들어올때
        //0

        // 양수
        // 작으면 음수 , 같으면  0 , 크면 양수 출력함
        return this.price - o.price;
    }
}
