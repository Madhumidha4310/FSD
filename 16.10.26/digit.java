package Fundamentals;
public class digit {

	public static void main(String[] args)
	{
		int a=12345;
		int count=0;
		
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.print("The digit are " + count);
	}
}
