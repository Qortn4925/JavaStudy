package leetcode.queue.p1700;

//0  동그란 샌드
//1  네모난 샌드

// 1번학생 >> 네모 샌드
// 0   >> 동그란 샌드  >> 만족하는 샌드 먹는 사람수 ??
//선호하는 샌드위치가 아니면 >> 맨 뒤로
//선호하는 샌드위치면  > 먹고 빠짐
// 두 큐에 poll
// 근데 한 바퀴 다돌아도  안되면 나와야 하니까


import java.util.LinkedList;
import java.util.Queue;


class Solution {
    // 첫 풀인데 종료 조건 설정을 잘못해서 좀 헤맨듯
    /*
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();

        for (int n : students) {
            stu.offer(n);
        }
        for (int n : sandwiches) {
            sand.offer(n);
        }
        int loop = 0;

        // 비어있으면  true 고 와일은 조건이 참일때 실행
        while (!stu.isEmpty() || stu.size() > loop) {
            int student = 0;
            int sandwich = 0;
            if (!stu.isEmpty() && !sand.isEmpty()) {
                student = stu.peek();
                sandwich = sand.peek();
            }


            if (student == sandwich) {
                stu.poll();
                sand.poll();
                loop = 0;
            } else {
                int k = stu.peek();
                stu.poll();
                stu.offer(k);
                loop++;
            }

        }
        return stu.size();


    }
    
     */


    // 제발 잘좀 적자 , 그리고  디버깅할때 눈으로만 보지 말고 체크하면서 하자
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stu = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();

        for (int n : students) {
            stu.offer(n);
        }
        for (int n : sandwiches) {
            sand.offer(n);
        }
        int loop = 0;

        // 비어있으면  true 고 와일은 조건이 참일때 실행
        while (!stu.isEmpty() && stu.size() > loop) {
            int student = stu.poll();
            int sandwich = sand.peek();
            if (student == sandwich) {
                sand.poll();
                loop = 0;
            } else {
                stu.offer(student);
                loop++;
            }

        }
        return stu.size();


    }
}

