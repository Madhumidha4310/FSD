package Fundamentals;
import java.util.Scanner;

public class Vote {
	
	public static void main(String[] args)
	{
		System.out.print("Enter the age: ");
		Scanner src=new Scanner(System.in);
		int age=src.nextInt();
		
		if(age>=18)
		{
			System.out.print("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
	}
}
