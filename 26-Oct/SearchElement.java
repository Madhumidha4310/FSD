package Oops;
import java.util.Arrays;
public class SearchElement {

	public static void main(String[] args)
	{
		int[] rollno={30,65,109,73,100,127};
		int search=109;
		int index = Arrays.binarySearch(rollno, search);
		System.out.println("Roll No is Found");
		System.out.println("Position : " + index);
	}
}
