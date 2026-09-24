public class CurrentAccount extends BankAccount implements Transferable {

    private static final int OVERDRAFT_LIMIT = 2000;

    public CurrentAccount(int accountNumber, int balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public void withdraw(int amount) {

        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {
            withdrawAmount(amount);
            System.out.println("₹" + amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void transfer(BankAccount receiver, int amount) {

        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {

            withdrawAmount(amount);

            receiver.deposit(amount);

            System.out.println("₹" + amount + " transferred successfully.");
        } else {
            System.out.println("Transfer failed. Overdraft limit exceeded.");
        }
    }
}