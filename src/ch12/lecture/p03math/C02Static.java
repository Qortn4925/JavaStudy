package ch12.lecture.p03math;

//static import

import java.util.Arrays;

import static java.lang.Math.*;
import static java.util.Arrays.copyOf;

public class C02Static {
    public static void main(String[] args) {
        //static field
        double p = PI;


        //static method
        int m = max(300, 500);

        int[] a = {5, 9, 1};
        System.out.println(Arrays.toString(a));
        int[] b = copyOf(a, a.length);
        
    }
}
