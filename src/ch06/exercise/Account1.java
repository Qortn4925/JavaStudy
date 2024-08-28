package ch06.exercise;

import java.util.Scanner;

public class Account1 {
    Account1[] BankApplication = new Account1[100];

    int idx = 0;
    Scanner sc = new Scanner(System.in);
    String menu;
    private String id = "";
    private String name = "";
    private String money = "";


    public void run() {
        boolean run = true;


        while (run) {
            String a = """
                    
                    ----------------------------------
                    1.생성 |2.목록 |3.예금 |4. 출금 |5.종료
                    -----------------------------------
                    
                    선택 >
                    
                    """;
            System.out.println(a);
            menu = sc.nextLine();
            switch (menu) {

                case "1" -> {
                    createAccount();
                }
                case "2" -> {
                    viewAccount();
                }
                case "3" -> {
                    insertMoney();
                }
                case "4" -> {
                    extractMoney();
                }
                case "5" -> {
                    run = false;
                }
            }

        }


    }

    public void createAccount() {
        BankApplication[idx] = new Account1();

        String id;
        String name;
        String money;
        String a = """
                ========
                계좌생성
                ========
                계좌번호:
                계좌주:
                초기입금금액:
                """;
        System.out.println(a);
        id = sc.nextLine();
        name = sc.nextLine();
        money = sc.nextLine();

        BankApplication[idx].setId(id);
        BankApplication[idx].name = name;
        BankApplication[idx].money = money;
        System.out.println("계좌가 생성되었습니다.");
        idx++; // 생성 될때 마다 그 다음 인덱스에
    }

    public void viewAccount() {

        String a = """
                ======
                계좌목록
                ======
                """;
        for (int i = 0; i < idx; i++) {
            System.out.println(BankApplication[i].id + " " + BankApplication[i].name + "  " + BankApplication[i].money);
        }


    }

    public void insertMoney() {
        String findId;
        String insertMoney;

        String a = """
                ========
                3.예금
                ========
                """;
        System.out.println(a);
        System.out.println("계좌번호를 입력하세요:");
        findId = sc.nextLine();
        System.out.println("예금액: ");
        insertMoney = sc.nextLine();

        for (int i = 0; i < idx; i++) {
            if (BankApplication[i].id.equals(findId)) {
                BankApplication[i].money = "" + (Integer.parseInt(BankApplication[i].money) + Integer.parseInt(insertMoney));
            }
        }

    }

    public void extractMoney() {
        String findId;
        String insertMoney;

        String a = """
                ========
                4.출금
                ========
                """;
        System.out.println(a);
        System.out.println("계좌번호를 입력하세요:");
        findId = sc.nextLine();
        System.out.println("출금액: ");
        insertMoney = sc.nextLine();
        for (int i = 0; i < idx; i++) {
            if (BankApplication[i].id.equals(findId)) {
                BankApplication[i].money = "" + (Integer.parseInt(BankApplication[i].money) - Integer.parseInt(insertMoney));
            }
        }
        System.out.println("출금이 성공되었습니다.");
    }


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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }
}
