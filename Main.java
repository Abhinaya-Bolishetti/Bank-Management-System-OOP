import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankManagement bank = new BankManagement();

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. View All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Customer ID : ");
                    int id = sc.nextInt();

                    System.out.print("Name : ");
                    String name = sc.next();

                    System.out.print("Phone : ");
                    String phone = sc.next();

                    System.out.print("Address : ");
                    String address = sc.next();

                    System.out.print("Account Number : ");
                    int accNo = sc.nextInt();

                    System.out.print("Opening Balance : ");
                    int balance = sc.nextInt();

                    Customer customer =
                            new Customer(id, name, phone, address);

                    SavingsAccount savings =
                            new SavingsAccount(accNo, balance, customer);

                    bank.addAccount(savings);

                    System.out.println("Savings Account Created.");
                    break;

                case 2:

                    System.out.print("Customer ID : ");
                    id = sc.nextInt();

                    System.out.print("Name : ");
                    name = sc.next();

                    System.out.print("Phone : ");
                    phone = sc.next();

                    System.out.print("Address : ");
                    address = sc.next();

                    System.out.print("Account Number : ");
                    accNo = sc.nextInt();

                    System.out.print("Opening Balance : ");
                    balance = sc.nextInt();

                    customer =
                            new Customer(id, name, phone, address);

                    CurrentAccount current =
                            new CurrentAccount(accNo, balance, customer);

                    bank.addAccount(current);

                    System.out.println("Current Account Created.");
                    break;

                case 3:

                    System.out.print("Account Number : ");
                    accNo = sc.nextInt();

                    System.out.print("Amount : ");
                    int amount = sc.nextInt();

                    bank.depositMoney(accNo, amount);
                    break;

                case 4:

                    System.out.print("Account Number : ");
                    accNo = sc.nextInt();

                    System.out.print("Amount : ");
                    amount = sc.nextInt();

                    bank.withdrawMoney(accNo, amount);
                    break;

                case 5:

                    System.out.print("Sender Account : ");
                    int sender = sc.nextInt();

                    System.out.print("Receiver Account : ");
                    int receiver = sc.nextInt();

                    System.out.print("Amount : ");
                    amount = sc.nextInt();

                    bank.transferMoney(sender, receiver, amount);
                    break;

                case 6:

                    bank.displayAllAccounts();
                    break;

                case 7:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}