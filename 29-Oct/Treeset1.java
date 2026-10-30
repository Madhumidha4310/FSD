package Collections;
import java.util.*;
public class Treeset1 {

	public static void main(String[] args){
		TreeSet<Integer> set1=new TreeSet<Integer>();  
        set1.add(40);
        set1.add(20);
        set1.add(10);
        System.out.println("Elements: " + set1);
        
        set1.add(10);
        System.out.println("Adding duplicate 10: " + set1);
        System.out.println("Size of the set: " + set1.size());
        System.out.println("Before sorting: " + set1);
        
        ArrayList<Integer> list = new ArrayList<>(set1);
        java.util.Collections.sort(list);
        System.out.println("After sorting: " + list);
        try {
            set1.add(null);
        } catch (NullPointerException e) {
            System.out.println("Null elements are not allowed");
        }
	}
}
