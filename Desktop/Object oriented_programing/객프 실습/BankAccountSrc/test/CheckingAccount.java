package test;

public class CheckingAccount extends Account{
    public CheckingAccount(String owner, double rate) {
        super(owner, rate);
    }

    @Override
    public String generateAcctNum() {
        return BankUtil.generateAcctNum(101,200,10000,50000);
    }
}
