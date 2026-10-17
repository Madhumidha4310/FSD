package Fundamentals;
import java.util.Scanner;
public class Assignment {

	public static void main(String[] args)
	{
		int balance=5000;
		Bank b = new Bank();
        b.updateBalance(balance);
    }
}
class Bank {
    public void updateBalance(int balance) {
        System.out.println("Initial Balance: " + balance);
        balance += 1500;
        System.out.println("After Deposit: " + balance);
        balance -= 1000;
        System.out.println("After Withdrawal: " + balance);
	}
}
