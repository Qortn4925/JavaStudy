package ch12.exercise.sol5;

import java.util.Objects;

public class Student {
    private String studnetNum;

    public Student(String studnetNum) {
        this.studnetNum = studnetNum;
    }

    public String getStudnetNum() {
        return studnetNum;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Student target) {
//            return studnetNum.equals(target.studnetNum);
//        }
//        return false;
//    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getStudnetNum());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getStudnetNum(), student.getStudnetNum());
    }
}
