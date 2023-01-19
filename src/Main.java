import java.util.List;

public class Main {
    public static void main(String[] args) {
        BasicAccount basic = new BasicAccount(1, 200);
        StandardAccount standard = new StandardAccount(2, -100);
        PremiumAccount premium = new PremiumAccount(3);
        Bank bank = new Bank();
        bank.OpenAccount(basic);
        bank.OpenAccount(standard);
        bank.OpenAccount(premium);
        List<IAccount> all = bank.GetAllAccounts();
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).GetAccountNumber());
        }
        System.out.println(basic.GetCurrentBalance());
        basic.Deposit(1000);
        standard.Withdraw(0.01);
        premium.Deposit(100);
        System.out.println(basic.GetCurrentBalance());
        System.out.println(standard.GetCurrentBalance());
        bank.CloseAccount(standard.GetAccountNumber());
    }
}