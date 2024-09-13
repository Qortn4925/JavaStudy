package ch11.exercise.sol6;

public class Sol06 {
    public static void main(String[] args) {

        //  int 10
        // 숫자로 변환할 수 없음
        // 10
        //인덱스를 초과했음
        // 10

        String[] strArray = {"10", "2a"};
        int value = 0;

        for (int i = 0; i <= 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과");
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가 문자열");
            } finally {
                System.out.println(value);
            }
        }
    }
}
