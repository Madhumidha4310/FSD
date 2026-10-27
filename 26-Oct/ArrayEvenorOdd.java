package Oops;
import java.util.Arrays;
public class ArrayEvenorOdd {

	public static void main(String[] args)
	{
		int even=0;
		int odd=0;
		int [] rollno={10,32,21,19,9,24,12,5};
		for(int i=0;i<(rollno.length);i++)
		{
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even Numbers Count: "+even);
		System.out.println("Odd Numbers Count: "+odd);
	}
}
