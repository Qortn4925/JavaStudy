package ch05.lecture.p02reference;

public class C04Matrix {
    public static void main(String[] args) {
        // 행의 수만 결정 해줄 수 있다! > 왜 그런가 했더니 ,
        // 어차피 m 은 아래 코드 기준으로 배열 3개가 저장되어 있는 주소의 값으 가지고 있는ㄱ고

        //  m[0],m[1],m[2] 의 공간만 만들어 놓지도 않네 > 그 후에 해당 공간들에 새로운 값을 저장하는건 따로 해도 상관 없는거지
        // 근데 행의 수를 결정 안하고  열의 값만 넣는것은 > 반대니까 공간도 안잡아 놓았는데 할려니까 안되는거고

        // 인스턴스가 생성된 후 그 곳의 정보를 불러오기 위해서 주소값을 저장하는거임
        // 그래서 아래  m[0],m[1],m[2] 는 아직 null로 나오는거고
        int[][] m = new int[3][];
        System.out.println(m);
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);
//        m[0] = new int[]{1, 2}; //  메모리 할당 , >
//        System.out.println(m[0]); // m[0] 메모리 주소 값을 저장하게 됨
        m[0] = new int[3];
        System.out.println(m[0]);
        m[1] = new int[]{11, 22, 33};
        m[2] = new int[]{99, 88};//  인스턴스 생성후 메모리 주소 할당

        System.out.println(m[1][0]);
        System.out.println(m[1][2]);
        System.out.println(m[2][1]);

    }
}
