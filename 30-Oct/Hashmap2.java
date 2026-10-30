package Collections;
import java.util.*;
public class Hashmap2 {

	public static void main(String args[]) {

		//PUT(add)
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(201, "Arun");
        hm.put(202, "Kumar");
        hm.put(203, "Priya");
        System.out.println("After invoking put() method");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        hm.putIfAbsent(204, "Madhu");
        System.out.println("After invoking putIfAbsent() method");
        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(205, "Divya");
        map.putAll(hm);
        System.out.println("After invoking putAll() method");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
