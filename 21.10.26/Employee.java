package Fundamentals;

public class Employee {

	public static void main(String[] args){
		Manager m=new Manager();
		m.name="Priya";
		m.age=30;
		m.employeeId=201;
		m.salary=25000;
		m.department="IT";
		m.display();
	}
}
class person{
	String name;
	int age;
}
class Emp extends person{
	int employeeId;
	int salary;
}
class Manager extends Emp{
	String department;
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + department);
	}
}