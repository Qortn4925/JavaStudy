package ch04.sec02;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("time = " + time);

        switch (time) {
            // 8~ 11 사이에    9시면 회의 업무 외근 을 봐야해서 break를 안 맥이고 ,    10시면 업무 외근을 해야해서 안 맥이고
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            default:
                System.out.println("외긔");
        }
    }
}
