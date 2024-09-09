package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C04Equals {
    public static void main(String[] args) {
        Set<Boo4> set = new HashSet<>();
        boolean b1 = set.add(new Boo4("java", "shin"));

        boolean b2 = set.add(new Boo4("git", "linusx"));
        boolean b3 = set.add(new Boo4("java", "shin"));

        int size = set.size();
        System.out.println("size = " + size);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}

class Boo4 {
    private String title;
    private String author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boo4 boo4 = (Boo4) o;
        return Objects.equals(getTitle(), boo4.getTitle()) && Objects.equals(getAuthor(), boo4.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }

    public Boo4(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
