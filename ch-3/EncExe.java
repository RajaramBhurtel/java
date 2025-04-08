public class EncExe {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // System.out.println(account.balance);  

        account.setBalance(500);
        // account.withdraw(200);
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
    public void setBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // public void withdraw(double amount) {
    //     if (amount > 0 && amount <= balance) {
    //         balance -= amount;
    //     }
    // }
}


