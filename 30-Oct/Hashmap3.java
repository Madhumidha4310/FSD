package Collections;
import java.util.*;
public class Hashmap3 {

	public static void main(String args[]) {
		//REMOVE
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(201, "Arun");
        map.put(202, "Kumar");
        map.put(203, "Priya");
        map.put(204, "Madhu");
        System.out.println("Initial list of elements: " + map);
        map.remove(201);
        System.out.println("Updated list of elements: " + map);
        map.remove(202);
        System.out.println("Updated list of elements: " + map);
        map.remove(203, "Priya");
        System.out.println("Updated list of elements: " + map);
    }
}
