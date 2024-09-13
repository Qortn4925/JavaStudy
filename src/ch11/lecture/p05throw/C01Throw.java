package ch11.lecture.p05throw;

public class C01Throw {

    public static void some3() {
//        var e = new ArithmeticException();

//        throw e;
        throw new ArithmeticException();
    }


    public static void some2() throws IndexOutOfBoundsException {
        IndexOutOfBoundsException e = new IndexOutOfBoundsException();

        throw e;
    }

    public static void some1() throws RuntimeException {
        RuntimeException runtimeException = new RuntimeException();
        throw runtimeException;
    }


    public static void main(String[] args) {

        some3();
        Integer.parseInt("");

        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
