package Collections;
import java.util.*;
public class Hashmap1 {
    public static void main(String[] args) {
    	//REPLACE
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Madhu");
        hm.put(101, "Priya");
        hm.put(102, "Riya");
        System.out.println("Initial list of elements:");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "Priya", "Ravi");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Ajay");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}