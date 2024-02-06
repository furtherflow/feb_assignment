import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    public void CloseAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() < 0) {
                    System.out.println("Cannot close account " + accountNumber + " due to debt left.");
                    return;
                } else {
                    accounts.remove(account);
                    System.out.println("Account number " + accountNumber + " closed.");
                    return;
                }
            }
        }
        System.out.println("Account number " + accountNumber + " not found.");
    }


    @Override
    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balance) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balance) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}
