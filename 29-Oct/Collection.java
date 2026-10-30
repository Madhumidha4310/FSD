package Collections;
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		//Array List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(15);
        list.add(25);
        list.add(15);
        list.add(null);
        System.out.println("ArrayList: " + list);

        //Linked List
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(50);
        linkedList.add(15);
        linkedList.add(25);
        linkedList.add(15);
        linkedList.add(null);
        System.out.println("LinkedList: " + linkedList);

        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(50);
        set.add(15);
        set.add(25);
        set.add(15);
        set.add(null);
        System.out.println("HashSet: " + set);

        //LinkedHashSet
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(50);
        linkedSet.add(15);
        linkedSet.add(25);
        linkedSet.add(15);
        linkedSet.add(null);
        System.out.println("LinkedHashSet: " + linkedSet);

        //TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(15);
        System.out.println("TreeSet: " + treeSet);

        //HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Arun");
        map.put(102, "Kumar");
        map.put(103, "Priya");
        map.put(null, "Madhu");
        map.put(104, null);
        System.out.println("HashMap: " + map);

        //LinkedHashMap
        LinkedHashMap<Integer, String> linkedMap=new LinkedHashMap<>();
        linkedMap.put(101, "Arun");
        linkedMap.put(102, "Kumar");
        linkedMap.put(103, "Priya");
        linkedMap.put(null, "Madhu");
        linkedMap.put(104, null);
        System.out.println("LinkedHashMap: " + linkedMap);

        //TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(301, "Anu");
        treeMap.put(101, "Divya");
        treeMap.put(201, "Ramesh");
        treeMap.put(401, null);
        System.out.println("TreeMap: " + treeMap);
    }
}
