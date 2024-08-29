package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child ch = new Child();

        Parent pa = ch;

        pa.method1();
        pa.method2();   // 자식의  오버라이딩된 메소드를 불러옴 > 인스턴스 주소가 child를 가리켜서
//        pa.method3();   // 부모가 원래 가지고 있던 메소드를 사용하거나 ,오버라이딩 된 메소드를 이용하는건 > 오버라이딩된 메소드로 출력하지만
        // 부모가 원래 가지고 있지 않았던 ,메소드는 사용이 안됨

        //자식이 부모가 가지고 있던 쌍커풀 , 이나 어떤 유전적 형질을 계승받는건 당연하지만
        // 자식만이 가지고 있던 점의 위치를 부모의 몸에 같은 위치에 점이 있을거란 보장은 없다 ?
        // ㅋㅋㅋ 위에 두 줄은 개소리고 실질적인 타입은 Parent가 맞아서 그럼 > Parent만 가지고 있던걸 사용할수 잇는거지 , 오버라이딩 된메소드는 . 자식의 오버라이딩을 ㅏㅅ용하지만

        ch.method3();
    }
}
