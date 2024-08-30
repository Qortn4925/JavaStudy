package ch08.lecture.p01interface;

import ch07.sec07.exam02.SportsCar;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class C06Polymorphism {
    public static void main(String[] args) {
        String s = "java";

        Serializable o = s;
        CharSequence p = s;
        Comparable q = s;
        Constable r = s;
        ConstantDesc t = s;

        Scanner sc = new Scanner(System.in);

        Object v1 = sc;
        Closeable v2 = sc;
        AutoCloseable v3 = sc;
        Iterator V4 = sc;

    }
}
