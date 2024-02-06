public class PremiumAccount extends AbstractAccount {
    public PremiumAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double Withdraw(double amount) {
        currentBalance -= amount;
        return amount;
    }

}