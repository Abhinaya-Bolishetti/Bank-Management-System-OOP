import java.util.ArrayList;

public class BankManagement {

    private ArrayList<BankAccount> accounts = new ArrayList<>();
   public void addAccount(BankAccount account) {

    if (findAccount(account.getAccountNumber()) != null) {
        System.out.println("Account Number already exists.");
        return;
    }

    accounts.add(account);
    System.out.println("Account Created Successfully.");
}
public void displayAllAccounts(){

    for(BankAccount account : accounts){
        account.displayAccountDetails();
        System.out.println();
    }

}
public BankAccount findAccount(int accountNumber){

    for(BankAccount account : accounts){

        if(account.getAccountNumber() == accountNumber){
            return account;
        }

    }

    return null;
}
public void depositMoney(int accountNumber, int amount){

    BankAccount account = findAccount(accountNumber);

    if(account != null){
        account.deposit(amount);
    }else{
        System.out.println("Account not found.");
    }

}
public void withdrawMoney(int accountNumber, int amount){

    BankAccount account = findAccount(accountNumber);

    if(account != null){
        account.withdraw(amount);
    }else{
        System.out.println("Account not found.");
    }

}
public void transferMoney(int senderAcc,
                          int receiverAcc,
                          int amount){

    BankAccount sender = findAccount(senderAcc);
    BankAccount receiver = findAccount(receiverAcc);

    if(sender == null || receiver == null){
        System.out.println("Invalid Account Number.");
        return;
    }

    if(sender instanceof Transferable){
        ((Transferable) sender).transfer(receiver, amount);
    }
    if (senderAcc == receiverAcc) {
    System.out.println("Sender and Receiver cannot be the same account.");
    return;
}

}

}