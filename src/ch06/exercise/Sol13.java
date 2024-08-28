package ch06.exercise;

public class Sol13 {
    public static void main(String[] args) {
        Member mb = new Member("hong", "12345");

        mb.login(mb.getId(), mb.getPassword());
        mb.logout(mb.getId());

    }
}

class Member {
    private String name;


    private String id;
    private String password;
    private int age;

    Member(String id, String password) {
        setId(id);
        setPassword(password);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
