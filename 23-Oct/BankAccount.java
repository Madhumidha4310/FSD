package Oops;
public class BankAccount {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        System.out.println("Account Holder Name: " +p.getAccount_holder_name());
        System.out.println("Account Number: " +p.getAccount_number());    
        System.out.println("Account Balance: " +p.getAccount_balance());
        System.out.println("Email: " +p.GetAccount_holder_email());
    }
}

class HDFC {
    String account_holder_name = "Madhu";
    long account_number = 1234605;
    long account_balance = 30000;
    String account_holder_email = "madhue101@gmail";

    public String getAccount_holder_name() {
        return account_holder_name;
    }
    public long getAccount_number() {
        return account_number;
    }
    public long getAccount_balance() {
        return account_balance;
    }
    public String GetAccount_holder_email() {
        return account_holder_email;
    }
    public void setAccount_balance(long balance) {
        account_balance = balance;
    }
    public void setAccount_holder_email(String email) {
        account_holder_email = email;
    }
    void ShowBalance() {
        System.out.println(account_balance);
    }
}
class Paytm extends HDFC {
}