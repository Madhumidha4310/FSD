package Oops;

public class Constructor {

	public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("Madhu");
        Employee e3=new Employee("Madhu", 101);
        e1.display();
    }
}

class Student {
    String name;
    int rollno;
    Student() {
        name="Unknown";
        rollno=0;
        System.out.println("Student Default Constructor");
    }
    Student(String name) {
        this.name=name;
        rollno=0;
        System.out.println("Student Constructor with Name "+name);
    }
    Student(String name, int rollno) {
        this.name=name;
        this.rollno=rollno;
        System.out.println("Student Constructor with Name "+name+ " and RollNo "+rollno);
    }
    public void display() {
    	System.out.println("Student class work Successfully!");
    }
}
class Employee extends Student{
	Employee() {
        super();
        System.out.println("Employee Default Constructor");
    }
    Employee(String name) {
        super(name);
        System.out.println("Employee Constructor with Name " + name);
    }
    Employee(String name, int rollno) {
        super(name, rollno);
        System.out.println("Employee Constructor with Name "+ name + " and RollNo " + rollno);
    }
    public void display() {
        super.display();
        System.out.println("Employee class work Successfully!");
    }
}
