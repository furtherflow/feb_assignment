public class BasicAccount extends AbstractAccount {
    private double withdrawLimit;

    public BasicAccount(int accountNumber, double withdrawLimit) {
        super(accountNumber);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= withdrawLimit){
            currentBalance -= amount;
            return amount;
        }
        else {
            currentBalance -= withdrawLimit;
            return withdrawLimit;
        }
    }
}
