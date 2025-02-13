class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

          class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance is 1000

        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current balance: " + account.getBalance());

        account.withdraw(1500); // This should show an error due to insufficient balance
    }
}
