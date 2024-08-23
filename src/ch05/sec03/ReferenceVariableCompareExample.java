package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {

        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;                                // 배열의 이름은 포인터의 주소값을 저장한다
        System.out.println(arr1 == arr2);           // 포인터 주소값의 비교가 될것이이게 false
        System.out.println(arr3 == arr2);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

    }
}
