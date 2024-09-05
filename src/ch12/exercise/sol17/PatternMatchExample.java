package ch12.exercise.sol17;

import java.util.regex.Pattern;

public class PatternMatchExample {
    public static void main(String[] args) {
        String id = "5Angel1004";

        String regExp = "[a-zA-z]\\w{7,11}";

        id = "A12qwqqq";

        boolean isMatch = Pattern.matches(regExp, "id");

        if (isMatch) {
            System.out.println("사용 o");
        } else
            System.out.println("사용 x");
    }
}
