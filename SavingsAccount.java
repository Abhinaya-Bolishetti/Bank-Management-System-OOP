public class SavingsAccount extends BankAccount implements Transferable {

    public SavingsAccount(int accountNumber, int balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public void withdraw(int amount) {

        if (getBalance() - amount >= 1000) {
            withdrawAmount(amount);
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Minimum balance should be ₹1000.");
        }
    }

    @Override
    public void transfer(BankAccount receiver, int amount) {

        if (getBalance() - amount >= 1000) {

            withdrawAmount(amount);

            receiver.deposit(amount);

            System.out.println("₹" + amount + " transferred successfully.");
        } else {
            System.out.println("Transfer failed. Minimum balance required.");
        }
    }
}