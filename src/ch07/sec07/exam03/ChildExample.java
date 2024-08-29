package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent pa = new Child();

        pa.field1 = "dat1";
        pa.method();
        pa.method2();

//        pa.field2 = "ㅁㄴ";
//        pa.method3();  불가능
        System.out.println(pa.field1);
        Child ch = (Child) pa; // 자식 인스턴스를 가지고 있던 부모타입 객체를 > 다시 자손으로 형변환 해서 자손의 접근한거구나
        ch.field2 = "data2";
        ch.method3();

        System.out.println(ch.field2);
    }

}







