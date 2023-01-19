public class BasicAccount implements IAccount{

    //state
    int accountNumber;
    double withdrawLimit;

    //constructor
    public BasicAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.withdrawLimit = withdrawLimit;
    }
    //Behavior
    @Override
    public double Deposit(double amount)  {
        return amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount < withdrawLimit) {
            return amount;
        } else {
            return 0;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return this.withdrawLimit;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
    }



