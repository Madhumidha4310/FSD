package Fundamentals;

class BankAccount{
	int Account_no;
	int balance;
}
class SavingsAccount extends BankAccount{
	void bank(){
		Account_no=120011;
		balance=25000;
		System.out.println("Savings Account");
		System.out.println("Account Number " + Account_no);
		System.out.println("Balance: " + balance);
	}
}
class CurrentAccount extends BankAccount{
	void bank(){
		int Account_no=102340;
		int balance=50000;
		System.out.println("Current Account");
		System.out.println("Account Number " + Account_no);
		System.out.println("Balance: " + balance);
	}
}
public class Bank{
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount();
		s.bank();
		CurrentAccount c=new CurrentAccount();
		c.bank();
	}
}