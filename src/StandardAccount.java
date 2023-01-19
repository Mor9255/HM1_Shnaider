public class StandardAccount implements IAccount{

    //state
    int accountNumber;
    double creditLimit;

    //constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
    }
    //Behavior
    @Override
    public double Deposit(double amount)  {
        return amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > creditLimit) {
            return 0;
        } else {
            return amount;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return this.creditLimit;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }

}

