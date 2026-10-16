package Fundamentals;
import java.util.Scanner;

public class postive {
	
	public static void main(String[] args)
	{
		System.out.print("Enter the number:");
		Scanner src=new Scanner(System.in);
		int num=src.nextInt();
		
		if(num>0)
		{
			System.out.print("It is positive");
		}
		else
		{
			System.out.print("The number is not a positive");
		}
	}
}
