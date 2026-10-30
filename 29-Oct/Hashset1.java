package Collections;
import java.util.*;
public class Hashset1 {

	public static void main(String args[]){  
		HashSet<String> set=new HashSet<String>();  
		set.add("Madhu");  
		set.add("Vijay");  
		set.add("Madhu");  
		set.add("Priya");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		} 
		
		System.out.println("Linked Hash Set");  
		LinkedHashSet<String> set1=new LinkedHashSet<String>();  
		set1.add("Ravi");  
		set1.add("Vijay");  
		set1.add("Ravi");  
		set1.add("Ajay");  
		Iterator<String> itr1=set1.iterator();  
		while(itr1.hasNext())
		{ 
			System.out.println(itr1.next());  
		} 
	}  
}
