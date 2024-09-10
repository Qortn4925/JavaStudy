package ch15.exercise.sol10;

public class Student implements Comparable<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Student o) {
//        return this.score - o.score;
//        return o.score - this.score;
//        return this.id.compareTo(o.id);
        return o.id.compareTo(this.id);
    }


}
