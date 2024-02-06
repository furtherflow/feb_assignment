public class StandardAccount extends AbstractAccount {
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= currentBalance + creditLimit) {
            currentBalance -= amount;
            return amount;
        } else {
            double wasBalance = currentBalance;
            currentBalance = creditLimit;
            return (wasBalance + -(creditLimit));
        }
    }
}