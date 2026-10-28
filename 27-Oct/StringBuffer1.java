package Strings;

public class StringBuffer1 {

	public static void main(String[] args) {

        StringBuffer sb123 = new StringBuffer("Madhu");

        // 1. Print
        System.out.println(sb123);

        // 2. Append
        sb123.append("midha ");
        System.out.println("After append: " + sb123);

        // 3. Insert
        sb123.insert(11, "E");
        System.out.println("Insert: " + sb123);

        // 4. Replace
        sb123.replace(10, 13, "ABC");
        System.out.println("Replace: " + sb123);

        // 5. Delete
        sb123.delete(5, 10);
        System.out.println("Delete: " + sb123);

        // 6. Reverse
        sb123.reverse();
        System.out.println("Reverse: " + sb123);

        // 7. Length
        System.out.println("Length: " + sb123.length());

        // 8. Character
        System.out.println("Character at 0: " + sb123.charAt(0));
	}
}

