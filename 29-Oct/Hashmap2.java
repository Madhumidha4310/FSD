package Collections;
import java.util.*;
public class Hashmap2 {

	public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Arun");
        map.put(102, "Kumar");
        map.put(103, "Priya");
        map.put(104, "Madhu");

        System.out.println("Elements: " + map);
        map.remove(102);
        System.out.println("After removing 102: " + map);

        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.reverse(keys);
        System.out.println("Reversed the map:");

        for (int key : keys) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("HashMap: " + map);
    }
}
