import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accts = new ArrayList<>();
        accts.add(new CheckingAccount("Cho", 1.0));
        Account sa = new SavingAccount("Cho2", 3.5, 50000, 12);
        sa.deposit(50000);
        sa.deposit(5000);
        sa.withdraw(50000);
        accts.add(sa);
        for (Account a : accts) {
            if (a.getOwner().equals("Cho")) {
                System.out.println(a);
            }
        }

        Account a = accts.get(0);
        a.close();
        a.deposit(100);
        System.out.println(a);

    }
}
