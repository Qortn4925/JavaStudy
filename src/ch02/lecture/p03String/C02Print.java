package ch02.lecture.p03String;

public class C02Print {
    public static void main(String[] args) {
        System.out.println(" ln> 다음줄 로 넘어감");
        System.out.print("안에 내용만 출력");

        //printf(ormat) 형식에 맞춰서 출력 ??

        System.out.printf("안녕");
        System.out.println();
        System.out.printf("이름은 %s", "손흥민\n");
        System.out.printf("이름은 %s", "이강인");
        // 파이썬에서 f"하고 하는걸 훨씬 어렵게 사용하는거구나"
        //%s > 컴마 다음 거 ,  %n > 엔터  printf 함수에서는 %가 특정기능을 하는거임 %만 출력 >> %%
        String f = "이름은 %s";
        String name1 = "낄낄낄";
        String name2 = "황희찬";
        System.out.printf(f, name1);
        System.out.println();
        System.out.printf(f, name2);
        System.out.printf("이름은 %s%n", "메시");
    }
}
