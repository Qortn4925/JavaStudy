package ch12.lecture.p01object;

public class C03Equals {

    public static void main(String[] args) {
        Book b1 = new Book("이것이 자바다");
        Book b2 = new Book("모던 리액트");
        Book b3 = new Book("이것이 자바다");

        boolean r1 = b1.equals(b2);
        System.out.println("r1 = " + r1);

        boolean r2 = b1.equals(b3);
        System.out.println("r2 = " + r2);
    }
}

class Book {
    private String title;


    // 이 객체와 다른 객체가 같은 지 알려주는 메소드
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Book other) {
            if (this.title.equals(other.title))
                return true;
        }
        return false;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // eqauals
}
