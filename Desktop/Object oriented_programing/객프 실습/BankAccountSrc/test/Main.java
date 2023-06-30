package test;
import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> acct = new ArrayList<>();
        acct.add(new CheckingAccount("Cho", 1.0));
        Account sa = new SavingAccount("Cho2", 3.5, 50000, 12);
        sa.deposit(50000);
        sa.deposit(5000);
        sa.withdraw(50000);
        acct.add(sa);
        for(Account st:acct) {
            if (st.getOwner().equals("Cho")) {
                System.out.println(st);
            }
        }

        Account st = acct.get(0);
        st.close();
        st.deposit(100);
        System.out.println(st);
    }
}
