public abstract class BankAccount {

    private int accountNumber;
    private int balance;
    private Customer customer;

    // Constructor
    public BankAccount(int accountNumber, int balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    // Deposit method
    public void deposit(int amount) {
        this.balance += amount;
    }

    // Withdraw method
    // public void withdraw(int amount) {
    //     if (amount <= balance) {
    //         this.balance -= amount;
    //     } else {
    //         System.out.println("Insufficient Balance");
    //     }
    // }

     // Abstract Method
    public abstract void withdraw(int amount);


    // Getter for balance
    public int getBalance() {
        return balance;
    }
    public int getAccountNumber(){
    return accountNumber;
}

    // Protected helper for child classes
    protected void withdrawAmount(int amount) {
        balance -= amount;
    }


    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customer.getName());
        System.out.println("Phone Number   : " + customer.getPhoneNumber());
        System.out.println("Address        : " + customer.getAddress());
        System.out.println("Balance        : " + balance);
    }
}