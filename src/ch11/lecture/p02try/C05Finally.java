package ch11.lecture.p02try;

public class C05Finally {
    public static void main(String[] args) {

        try {
            int[] arr = {3, 4};
            int a = arr[3];

            System.out.println("a = " + a);
            return;
            // 리턴때문에 끝나니까

//            System.out.println("실행 안됨");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            // return 문을 만나도 실행,
            System.out.println("걍 무조건 실행");
        }

        // return 문을 만나서 실행이 안될 가능성도 있음
        System.out.println("try-catch 블럭 나와서 실행 ");
    }
}
