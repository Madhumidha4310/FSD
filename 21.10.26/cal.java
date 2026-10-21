package Fundamentals;

public class cal {

	public static void main(String[] args)
	{
		addition a=new addition();
		System.out.print("Addition: ");
		a.add(10,90);
		a.add(8.2,72.1);
		subtraction s=new subtraction();
		System.out.print("Subtraction: ");
		s.sub(100,90);
		s.sub(800.0,90.1);
		multiplication m=new multiplication();
		System.out.print("Multiplication: ");
		m.mul(1,90);
		m.mul(8.6,7.1);
		division d=new division();
		System.out.print("Division: ");
		d.div(5,90);
		d.div(120.2,12.1);
	}
}
class addition{
	void add(int a, int b){
		System.out.println(a+b);
	}
	void add(double a, double b){
		System.out.println(a+b);
	}
}
class subtraction{
	void sub(int a, int b){
		System.out.println(a-b);
	}
	void sub(double a, double b){
		System.out.println(a-b);
	}
}
class multiplication{
	void mul(int a, int b){
		System.out.println(a*b);
	}
	void mul(double a, double b){
		System.out.println(a*b);
	}
}
class division{
	void div(int a, int b){
		System.out.println(a/b);
	}
	void div(double a, double b){
		System.out.println(a/b);
	}
}