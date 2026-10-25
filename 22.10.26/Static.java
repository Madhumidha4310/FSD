package Oops;

public class Static{
	public static void main(String[] args) {

        Students s1 = new Students();
        Students s2 = new Students("Madhu");
        Students s3 = new Students("Madhu", 101);
        System.out.println();
        Students.collegeInfo();
        s1.display();
        s2.display();
        s3.display();
    }
}
class Students{

    String name;
    int rollno;
    static String collegeName = "Kamaraj College";

    // Static Method
    static void collegeInfo() {
        System.out.println("Welcome to " + collegeName);
    }

    // Default Constructor
    Students() {
        name = "Unknown";
        rollno = 0;
        System.out.println("Default Constructor");
    }

    // Constructor with one parameter
    Students(String name) {
        this.name = name;
        rollno = 0;
        System.out.println("Constructor with Name");
    }

    // Constructor with two parameters
    Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        System.out.println("Constructor with Name and RollNo");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
        System.out.println("College : " + collegeName);
        System.out.println();
    }
}
