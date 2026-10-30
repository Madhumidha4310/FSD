package Collections;
import java.util.*;
public class LinkedList2 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Arun");
        ll.add("Kumar");
        ll.add("Priya");
        ll.add("Madhu");
        ll.add("Karthik");
        ll.add("Ani");
        ll.add("Anu");
        ll.add("Divya");
        ll.add("Ramesh");
        ll.add("Suresh");

        System.out.println("Initial list of elements: " + ll);

        ll.remove("Vijay");
        System.out.println("After invoking remove(object) method: " + ll);

        ll.remove(0);
        System.out.println("After invoking remove(index) method: " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Kumar");
        ll2.add("Ravi");

        ll.addAll(ll2);
        System.out.println("Updated list: " + ll);

        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: " + ll);

        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: " + ll);

        ll.removeLast();
        System.out.println("After invoking removeLast() method: " + ll);

        ll.removeFirstOccurrence("Malar");
        System.out.println("After invoking removeFirstOccurrence() method: " + ll);

        ll.removeLastOccurrence("Riya");
        System.out.println("After invoking removeLastOccurrence() method: " + ll);

        ll.clear();
        System.out.println("After invoking clear() method: " + ll);
    }
}
