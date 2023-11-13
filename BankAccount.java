public class BankAccount {
    private String accountNumber;
    private double balance;


    //   Changing more than one value ones
    public void changeValues( String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    // Set an account number
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() !=10){
        return;
    }
        this.accountNumber = accountNumber;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A12345", 1000.0);

        // Accessing data through getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data through methods
        account.deposit(500.0);
        account.withdraw(200.0);

        System.out.println("Final Balance: $" + account.getBalance());
    }
}
