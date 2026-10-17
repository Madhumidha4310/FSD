package Fundamentals;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args)
	{
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a=src.nextInt();
		System.out.print("Enter the Second number ");
		int b=src.nextInt();
		Operation ar=new Operation();
		ar.add(a,b);
		ar.sub(a, b);
		ar.multi(a,b);
		ar.div(a, b);
		ar.f(a, b);
	}
}
class Operation{
	public void add(int a,int b){
		int add=a+b;
		System.out.println("Sum: "+add);
	}
	public void sub(int a, int b){
		int sub=a-b;
		System.out.println("Difference: " + sub);
	}
	public void multi(int a,int b){
		int mul=a*b;
		System.out.println("Product: " +mul);
	}
	public void div(int a,int b){
		int div=a/b;
		System.out.println("Quotient: " + div);
	}
	public void f(int a,int b){
		int f=a%b;
		System.out.println("Remainder: " +f);
	}
}