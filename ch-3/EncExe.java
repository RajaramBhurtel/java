public class EncExe {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());  // Access via getter
    }
}
class BankAccount {
    // Private variables
    private double balance;

    // Public getter method
    public double getBalance() {
        return balance;
    }

    // Public setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}


