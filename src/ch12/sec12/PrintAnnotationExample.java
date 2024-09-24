package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declareMethods = Service.class.getDeclaredMethods();
        for (Method method : declareMethods) {
            PrintAnnotation print = method.getAnnotation
                    (PrintAnnotation.class);
            printLine(print);
            method.invoke(new Service());

            printLine(print);

        }


    }

    private static void printLine(PrintAnnotation print) {
        if (print != null) {

            int number = print.number();
            for (int i = 0; i < number; i++) {
                String value = print.value();
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
