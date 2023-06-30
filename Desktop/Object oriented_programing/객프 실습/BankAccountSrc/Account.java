public abstract class Account {
    private String owner;
    private int balance;
    private String number;
    private double interestRate;
    private boolean closed;

    public Account(String owner, double rate) {
        closed = false;
        number = generateAcctNum();
        balance = 0;
        this.owner = owner;
        interestRate = rate;
    }

    public void deposit(int amount) {
         // 계좌가 해지 상태가 아니면 amount 입금
        // 적절한 오류 메시지 출력
        if (closed == false) {
            balance += amount;
            System.out.printf("%d원을 입금했습니다.", amount);
        }
        else {
            System.out.println("해지된 계좌입니다.");
        }
    }

    public void withdraw(int amount) {
        //계좌가 해지 상태가 아니면 amount 출금
        // 적절한 오류 메시지 출력
        if (closed == false) {
            if (balance >= amount) {
                balance -= amount;
                System.out.printf("%d원을 출금했습니다.", amount);
            }
            else {
                System.out.printf("잔액이 모자랍니다. 현재 잔액: %d\n", balance);
            }
        }
        else {
            System.out.println("해지된 계좌입니다.");
        }
    }
    public void close() {
        // 계좌 해지 "계좌 xxx-yyyyy를 해지. balance원을 환급\n" 출력
        closed = true;
        System.out.printf("계좌 %s를 해지. %d원을 환급\n", number, balance);
    }

    public String toString() {
        // 예금주, 잔고, 계좌 번호, 해지 상태를 문자열로 만들어 반환
        return "Owner: " + owner + " Balance: " + balance + " Acct Number: " + number + " Closed: " + closed;
    }

    public String getOwner() { return owner; }

    public abstract String generateAcctNum();
}
