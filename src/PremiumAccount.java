public class PremiumAccount implements IAccount{

    //state
    int accountNumber;

    //constructor
    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    //Behavior
    @Override
    public double Deposit(double amount)  {
        return amount;
    }

    @Override
    public double Withdraw(double amount) {
            return amount;
        }

    @Override
    public double GetCurrentBalance() {
        return 0;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}

