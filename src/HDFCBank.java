import java.util.UUID;

public class HDFCBank implements BankAccount {

    private int balance;
    private String accountNumber;

    private int roi;
    public HDFCBank( int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public HDFCBank(int balance, int roi) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());

        this.roi = roi;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(this.balance >= money){
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return amount * timeInYears * roi / 100;
    }
}
