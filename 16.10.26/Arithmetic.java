package Fundamentals;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args)
	{
		int a=10;
		int b=90;
		
		System.out.print("Enter the number ");
		Scanner src=new Scanner(System.in);
		int cal=src.nextInt();
		
		switch(cal)
		{
		case 1:
			int add=a+b;
			System.out.println("Addition: " + add);
			break;
			
		case 2:
			int sub=a-b;
			System.out.println("Subraction: " + sub);
			break;
			
		case 3:
			int mul=a*b;
			System.out.println("Multiplication: " + mul);
			break;
			
		case 4:
			int div=a/b;
			System.out.println("Division: " + div);
			break;
			
		default:
			System.out.println("Check the number");
			break;
		}
	}
}
