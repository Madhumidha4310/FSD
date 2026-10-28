package Strings;
import java.util.Scanner;
public class UsernameValidator {
    public static void main(String[] args) {

        Scanner src=new Scanner(System.in);
        System.out.print("Enter username: ");
        String username=src.nextLine();
        int length=username.length();
        boolean containsSpace=username.contains(" ");
        System.out.println("Username: " + username);
        System.out.println("Length: " + length);
        if (containsSpace) {
            System.out.println("Contains spaces: Yes");
        } else {
            System.out.println("Contains spaces: No");
        }
        if (length >= 5 && !containsSpace) {
            System.out.println("Username status: Valid");
        } else {
            System.out.println("Username status: Invalid");
        }
    }
}
