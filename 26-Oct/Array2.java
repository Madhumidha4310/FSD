package Oops;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args)
	{
		int[] arr={50,10,40,20,30};
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 30);
		int[] copy = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr));
		System.out.println("Index:"+index);
		System.out.println(Arrays.toString(copy));
		int sum = Arrays.stream(arr).sum();
	    System.out.println("Sum: " + sum);
	    int[] a = {45, 12, 78, 23, 9};
	    int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
	}
}
