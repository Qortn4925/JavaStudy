package ch06.exercise;

public class Sol13 {
    public static void main(String[] args) {
        Member mb = new Member("hong", "12345");

        mb.login(mb.id, mb.password);
        mb.logout(mb.id);

    }
}

class Member {
    String name;


    String id;
    String password;
    int age;

    Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            System.out.println("올바른 입력입니다.");
            return true;
        } else
            System.out.println("아이디 혹은 비밀번호를 다시 입력해주세요");
        return false;
    }

    public void logout(String id) {
        System.out.println(STR."\{id}님의 계정이 로그아웃 되었습니다.");
        
    }

}
