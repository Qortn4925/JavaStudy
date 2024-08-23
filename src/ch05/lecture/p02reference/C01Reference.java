package ch05.lecture.p02reference;

public class C01Reference {
    public static void main(String[] args) {
        int a;
        int arr[];

        a = 3;

        arr = new int[]{5, 6};
        System.out.println("a = " + a);
        System.out.println("arr = " + arr);
        System.out.println(System.identityHashCode(arr));       // 참조값 확인

        int b;

        b = a;
        System.out.println("b = " + b);
        a = 30;
        System.out.println("b = " + b); //  일반 자료형은 x> 참조 는 바뀔텐뎅
        // 아래와 같이 선언하면 brr는 arr의 포인터 주소가 가리키는 곳을 저장하기에
        //  arr의 인덱스 값이 변환 되어도 그 값을 따라서 가져오지만
        //  위 코드 같은경우   그 때 당시 주소에 있던 값을 가져오고 끝나는것이기에  변동사항을 따라갈 수 없는것이다
        int[] brr = arr;

        System.out.println("brr[0] = " + brr[0]);
        System.out.println("brr[0] = " + arr[0]);
        arr[0] = 50;
        System.out.println("brr[0] = " + brr[0]);
        System.out.println("brr[0] = " + arr[0]);

    }


}
