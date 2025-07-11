public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000.50);
        System.out.println("Current balance: " + account.getBalance());

        account.setBalance(-500);
    }
}