package Oops;
class BankAccount{
    private long accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) 
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount) 
    {
        balance+=amount;
        System.out.println("Deposit Amount: " +amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal Amount: " +amount);
        } 
        else 
        {
            System.out.println("Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount(123456,"Ravi",10000);
        System.out.println("Account Holder: " +ba.getAccountHolder());
        System.out.println("Initial Balance: " +ba.getBalance());
        ba.deposit(2000);
        ba.withdraw(3000);
        System.out.println("Available Balance: " + ba.getBalance());
        ba.withdraw(9500);
    }
}