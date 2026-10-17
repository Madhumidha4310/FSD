package Fundamentals;
import java.util.Scanner;
public class Logical {

	public static void main(String[] args)
	{
		Scanner src = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = src.nextInt();
        System.out.print("Enter mark: ");
        int mark = src.nextInt();

        Student re = new Student();

        re.eligible(age, mark);

        src.close();
    }
}
class Student {
    public void eligible(int age, int mark) {
        System.out.println("Eligible: " + (age >= 18 && mark >= 50));
	}
}
