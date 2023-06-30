package test;

public abstract class Account {
    private String owner;//소유주
    private int balance;//잔고
    private String number;//계좌번호
    private double interestRate;//이자율
    boolean closed;//계좌 해지 여부

    public Account(String owner, double rate) {
        this.owner = owner;
        this.interestRate = rate;
        this.balance = 0;
        number = generateAcctNum();
    }

    public void deposit(int amount) {
        if (this.closed != false) {
            this.balance += amount;
            System.out.printf("%d원이 입금 되었습니다\n",amount);
        }
        else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    public void withdraw(int amount) {
        if (this.closed == true) {
            System.out.println("계좌가 존재하지 않습니다.");
        }
        else {
            if (this.balance > amount) {
                System.out.println("출금하려고 하는 금액이 잔액보다 많습니다.");
            }
            else {
                this.balance -= amount;
                System.out.printf("%d원이 출금 되었습니다\n",amount);
            }
        }
    }

    public void close() {
        this.closed = true;
        System.out.printf("계좌 %s를 해지. %d원을 환급\n", number, balance);
    }

    public String toString() {
        String re = "Owner: " + owner + " Balance: " + balance + " Acct Number: " + number + " Closed: " + closed;
        return re;
    }

    public String getOwner() { return owner;}
    public String getAccNum() { return number;}

    public abstract String generateAcctNum();
}
