package Fundamentals;

public class Cons {

	public static void main(String[] args) {
		Employee p=new PermanentS(2001, "Madhu", 35000);
        Employee c=new ContractS(2002, "Priya", 25000);
        p.calculateSalary();
        System.out.println();
        c.calculateSalary();
	}
}
class Employee{
	int empid;
	String name;
	double salary;
	Employee(int id, String n, double s){
		empid=id;
		name=n;
		salary=s;
	}
	void calculateSalary() {
        System.out.println("Salary: "+salary);
    }
	
}
class PermanentS extends Employee{
	PermanentS (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
		double s= salary+(salary*20/100);
		System.out.println("Permanent Employee");
		System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+s);
    }
}
class ContractS extends Employee{
	ContractS (int id, String n, double s){
		super(id, n, s);
	}
	void calculateSalary() {
        double s = salary + 2000;
        System.out.println("Contract Employee");
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+s);
    }
}