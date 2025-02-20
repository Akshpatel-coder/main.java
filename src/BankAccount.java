public class BankAccount {


        private double balance;

        // Constructor to initialize balance
        public BankAccount(double initialBalance) {
            if (initialBalance > 0.0) {
                balance = initialBalance;
            }
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0.0) {
                balance += amount;
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0.0 && amount <= balance) {
                balance -= amount;
            }
        }

        // Method to get the current balance
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            // Create a new bank account with an initial balance
            BankAccount account = new BankAccount(1300000.0);

            // Deposit money
            account.deposit(25000.0);

            // Withdraw money
            account.withdraw(12200.0);

            // Print the current balance
            System.out.println("Current balance: " + account.getBalance());
        }
    }


