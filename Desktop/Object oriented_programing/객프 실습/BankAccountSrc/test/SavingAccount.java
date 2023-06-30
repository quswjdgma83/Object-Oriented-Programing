package test;

public class SavingAccount extends Account {
    private int monthlyPayment;
    private int duration;
    private int paymentCount;

    public SavingAccount(String owner, double rate, int amount, int duration) {
        super(owner, rate);
/*        if (duration != 6 && duration != 12) {
            close();
        }*/
        monthlyPayment = amount;
        this.duration = duration;
        paymentCount = 0;
        //paymentCount = 1;
        //deposit(amount);
    }

    @Override
    public void deposit(int amount) {
        if (amount != monthlyPayment) {
            System.out.println("불입금액이 정해진 액수와 다릅니다");
        }
        else if (paymentCount == duration) {
            System.out.println("만기되었습니다. 더 이상 입금할 수 없습니다");
        }
        else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("적금 계좌에서는 출금할 수 없습니다.");
    }

    @Override
    public String generateAcctNum() {
        return BankUtil.generateAcctNum(201, 300, 10000, 50000);}
}