package ch06.exercise;

public class Account {

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(100);
        System.out.println("잔고:" + a.getBalance());
        a.setBalance(-100);
        System.out.println("잔고" + a.getBalance());
        a.setBalance(1000002);
        System.out.println("잔고" + a.getBalance());
    }

    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;
    private int balance;
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 돈 반환
    public int getBalance() {
        return balance;
    }

    // 돈 입력
    public void setBalance(int balance) {
        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
        } else {
            System.out.println("금액을 다시 넣어주세요 0~1000000");
        }

    }

}
