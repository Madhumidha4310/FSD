package Fundamentals;
import java.util.Scanner;

public class Div {
	
	public static void main(String[] args)
	{
		Scanner src=new Scanner(System.in);
		int num=src.nextInt();
		
		if(num%5==0)
		{
			System.out.print("It is divisible by 5");
		}
		else
		{
			System.out.println("it is not divisible by 5");
		}
	}
}
