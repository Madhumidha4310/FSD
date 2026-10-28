package Strings;

public class StringBuilder1 {

	public static void main(String[] args){
		StringBuilder b = new StringBuilder("Madhu");

        // 1. Print
        System.out.println(b);

        // 2. Append
        b.append("midha ");
        System.out.println("Append: " + b);

        // 3. Insert
        b.insert(11, "E");
        System.out.println("Insert: " + b);

        // 4. Replace
        b.replace(10, 13, "ABC");
        System.out.println("Replace: " + b);

        // 5. Delete
        b.delete(5, 10);
        System.out.println("Delete: " + b);

        // 6. Reverse
        b.reverse();
        System.out.println("Reverse: " + b);

        // 7. Length
        System.out.println("Length: " + b.length());

        // 8. Character
        System.out.println("Character at 0: " + b.charAt(0));
	}
}
