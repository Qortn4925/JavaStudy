package ch11.lecture.p05throw;

import java.io.IOException;

public class C03Throw {
    public static void action1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void action2() throws ClassNotFoundException, IOException {
        boolean a = true;

        // 실행 결과에 따라 다르면 둘다 명시 해주기
        if (a) {
            throw new ClassNotFoundException();
        } else {
            throw new IOException();
        }
    }

    public static void main(String[] args) {

        try {
            action1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            // 두개 니까 둘 다 기술 or 상위로 하나
            action2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
