package ch05.lecture.p02reference;

public class C02Reference {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8};
        int[] brr = new int[]{7, 8};

        int[] crr = arr;
        System.out.println("arr[0] = " + arr[0]);       //7
        System.out.println("brr[0] = " + brr[0]);       //7
        System.out.println("crr[0] = " + crr[0]);       //7
        arr[0] = 71;
        System.out.println("crr[0] = " + crr[0]);
        
        brr[0] = 72;
        crr[0] = 73;                // crr의 포인터와 arr의 포인터는 같은 장소를 가리키는데 > arr[0]의 71> 73으로 두 번 변동 된거임
        System.out.println("arr[0] = " + arr[0]);       //7
        System.out.println("brr[0] = " + brr[0]);       //7
        System.out.println("crr[0] = " + crr[0]);       //7
    }
}
