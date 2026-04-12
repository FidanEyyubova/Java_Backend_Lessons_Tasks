package Java_OOP_Fundamentals;
public class Task03EasyBankAccount {

    static class BankAccount {
        private final String owner;
        private double balance;

        public BankAccount(String owner, double initialBalance) {
            this.owner = owner;
            this.balance = Math.max(0, initialBalance);
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Error: Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Error: Withdrawal amount must be positive.");
            } else if (amount > balance) {
                System.out.println("Error: Insufficient funds for withdrawal of $" + amount);
            } else {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            }
        }

        public void printSummary() {
            System.out.println("Owner:   " + owner);
            System.out.println("Balance: $" + String.format("%.2f", balance));
        }
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Fidan", 500.00);
        myAccount.printSummary();

        myAccount.deposit(150.50);
        myAccount.withdraw(100.00);
        myAccount.withdraw(1000.00);
        myAccount.deposit(-50.00);

        myAccount.printSummary();
    }
}
