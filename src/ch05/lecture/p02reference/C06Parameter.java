package ch05.lecture.p02reference;

public class C06Parameter {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5};
        method(new int[]{6, 7});
        method(arr);

        System.out.println("arr[0] = " + arr[0]);  // >> 44 메소드 출력 후니까  a0 >> 44로 변겨오딘상탠
    }

    public static void method(int[] a) {
        System.out.println(a[0]);
        a[0] = 44;
        System.out.println("a[0] = " + a[0]);
    }
}
