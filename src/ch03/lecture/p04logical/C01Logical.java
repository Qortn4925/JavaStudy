package ch03.lecture.p04logical;

public class C01Logical {
    public static void main(String[] args) {
        // 논리연산자
        //and , or ,xor, not
        // and (&&)   피연산자 둘 ,  연산결과 boolean
        System.out.println("and------");
        System.out.println(true && true); // 제외 다 false

        //or (\\)
        //두 피연산자가 모두 false 일 때만 결과 false
        System.out.println("or-----");
        System.out.println(false || false);

        //xor(^)배타적 논리합 (caret) 삿갓
        //두 피연산자가 다르면 true, 같으면 fasle  , 피연산자 2
        System.out.println("xor-------");
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        //not (!)
        //결과는 피연산자의 반대  , 피연산자 1
        System.out.println("not------");
        System.out.println(!true);
    }

}
