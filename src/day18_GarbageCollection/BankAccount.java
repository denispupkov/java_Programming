package day18_GarbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo (String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    public void checkBalance () {
        System.out.println("Your available balance is: $"+ balance);
    }
    public void deposit (double amount) {
        if (amount <=0) {
            System.out.println("There is nothing to deposit");
            return;
        }
            System.out.println("Depositing $" + amount + " to " + accountHolder);
            balance += amount;
        }


    public void withdraw (double amount) {
        if (balance<amount) {
            System.out.println("Insufficient amount. The current account balance is "+balance);
        return;
        }

            System.out.println("Withdrawing $"+amount+" from "+accountHolder);
            balance -= amount;
        }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
}
