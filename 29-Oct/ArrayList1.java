package Collections;
import java.util.*;
public class ArrayList1 {

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Traversing list through ListIterator:");
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("\nTraversing list through for loop:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\nTraversing list through Iterator:");
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("\nTraversing list through forEach() method:");

        list.forEach(a -> {
            System.out.println(a);
        });
        System.out.println("\nTraversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a -> {
            System.out.println(a);
        });
    }
}