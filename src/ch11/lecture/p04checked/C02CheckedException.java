package ch11.lecture.p04checked;

public class C02CheckedException {
    public static void main(String[] args) {


        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        

    }
}
