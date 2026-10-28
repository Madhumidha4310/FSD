package Strings;
import java.util.Scanner;
public class EmailDomainExtractor {
    public static void main(String[] args) {

        Scanner src=new Scanner(System.in);
        System.out.print("Enter Your EmailID: ");
        String email=src.nextLine();
        int atIndex=email.indexOf("@");
        String username=email.substring(0, atIndex);
        String domain=email.substring(atIndex + 1);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
}
