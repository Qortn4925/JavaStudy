package ch12.exercise.sol5;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("1"));
        set.add(new Student("1"));
        set.add(new Student("2"));

        System.out.println("set.size() = " + set.size());
    
    }
}



