public abstract class AbstractAccount implements IAccount {
    protected int accountNumber;
    protected double currentBalance;

    public AbstractAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.currentBalance = 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public double GetCurrentBalance() {
        return currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }

    public abstract double Withdraw(double amount);
}
