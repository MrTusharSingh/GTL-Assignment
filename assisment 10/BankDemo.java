abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.05;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1000);
        System.out.println("Interest: " + account.calculateInterest());
    }
}