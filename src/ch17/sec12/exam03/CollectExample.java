package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 93),
                new Student("오해영", "여", 95)
        );

        Map<String, Double> map = list.stream()
                .collect(Collectors.groupingBy(e -> e.getSex(), Collectors.averagingDouble(s -> s.getScore())));

        Map<String, List<Student>> test = list.stream()
                .collect(Collectors.groupingBy(e -> e.getSex()));

        //스트림으로 > collect > 특정 기준으로 다시 분류 하고 싶었거든 > 그런거 저장하기엔 map이 좋아서
//        >groupingBy >로 맵을 만들었고> 그룹핑 바이 메소드는 , 키의 기준을 설정해줘야함 
// 키를 설정해주고 나서 > 그거에 맞는 원래 리스트로 분류해주는데 >  그 리스트를 쪼개고 싶어서 (MAP(key,list)상태에서
//for each로 받아주고 > 출력하기 편할려고  변수 설정후 >  기준에 맞는 수만 반환        
        list.stream()
                .collect(Collectors.groupingBy(e -> e.getSex()))
                .forEach((x, y) -> {
                            long count = y.stream().filter(a -> a.getScore() > 90)
                                    .count();
                            System.out.println(x + "해당 성별중 93을 넘기는 학생의 수는" + count);
                        }
                );


        System.out.println(map);
    }
}
