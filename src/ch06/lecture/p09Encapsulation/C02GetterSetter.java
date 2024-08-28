package ch06.lecture.p09Encapsulation;

public class C02GetterSetter {

}


//필드 특별한경우 제외 >> private
// private >> 클래스 내부 말곤 접근 불가능하니까 > 메소드로 접근 가능하도록
// 그래서 필드값 관련 내용은 public
// setter 와 getter를  public으로

class MyClass02 {
    private int age;
    private String name;


    private String email;
    private String address;
    private boolean married;
    private boolean enable;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // booleand 의  getter 메소드는


    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }

    public boolean isMarried() {
        return married;
    }
}