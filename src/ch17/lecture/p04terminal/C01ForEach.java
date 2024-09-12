package ch17.lecture.p04terminal;

import java.util.List;

public class C01ForEach {
    public static void main(String[] args) {

        //forEach: 스트림의 각 요소에 어떤 액션을 실행

        List<Integer> list = List.of(5, 10, 20, 1);

        list.stream()

                .forEach(System.out::println);


        System.out.println();

        List<Student1> student1s = List.of(
                new Student1("son", 70),
                new Student1("hong", 80),
                new Student1("lee", 90)

        );
        student1s.stream()
                .forEach(t -> System.out.println(t.getScore() + 5));

    }
    
}

class Student1 {
    private String name;
    private int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
