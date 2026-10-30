package Collections;
import java.util.*;
public class ALvsLL {

	public static void main(String[] args){  
		long startTime = System.currentTimeMillis();  
		ArrayList<String> list=new ArrayList<String>();  
        for (int i=0; i<100000; i++){
        	list.add("Madhu");
        	list.add("Priya");
        	list.remove(0);
        }  
        System.out.println("Time taken by ArrayList: " +(System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        LinkedList<String> ll=new LinkedList<String>();  
        for (int i=0; i<100000; i++){  
        	ll.add("Madhu");
        	ll.add("Priya");
        	ll.remove(0);
        }  
        System.out.println("Time taken by LinkedList: " + (System.currentTimeMillis() - startTime) + "ms");  
		}  
}
