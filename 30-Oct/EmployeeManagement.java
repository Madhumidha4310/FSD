package Collections;
import java.util.*;
public class EmployeeManagement {

	public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();
        HashMap<Integer, String> dept=new HashMap<>();
        dept.put(1,"CSE");
        dept.put(2,"IT");
        dept.put(3,"ECE");
        
        Employee e1=new Employee(101, "Arun", "CSE", 25000);
        Employee e2=new Employee(102, "Ravi", "IT", 30000);
        Employee e3=new Employee(103, "Priya", "ECE", 28000);
        Employee e4=new Employee(104, "Divya", "CSE", 40000);
        Employee e5=new Employee(105, "Kumar", "IT", 35000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("Employee Details:");
        Iterator<Employee> itr=list.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }

        int searchId=103;
        for (Employee e : list) {
            if (e.id == searchId) {
                System.out.println("Employee Found:");
                e.display();
            }
        }

        int removeId=102;
        Iterator<Employee> itr1 = list.iterator();
        while (itr1.hasNext()) {
            Employee e=itr1.next();
            if (e.id == removeId) {
                itr1.remove();
                System.out.println("Employee Removed: " + removeId);
                break;
            }
        }
        System.out.println("\nAfter Removing Employee:");
        for (Employee e : list) {
            e.display();
        }
        System.out.println("Department Details:");
        for (Integer key : dept.keySet()) {
            System.out.println(key + " = " + dept.get(key));
        }

        System.out.println("\nCSE Employees:");
        for (Employee e : list) {
            if (e.department.equals("CSE")) {
                e.display();
            }
        }

        System.out.println("IT Employees:");
        for (Employee e : list) {
            if (e.department.equals("IT")) {
                e.display();
            }
        }

        System.out.println("ECE Employees:");

        for (Employee e : list) {
            if (e.department.equals("ECE")) {
                e.display();
            }
        }

        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.salary - e2.salary;
            }
        });

        System.out.println("\nEmployees Sorted by Salary:");
        for (Employee e : list) {
            e.display();
        }
        System.out.println("Highest Paid Employee:");
        list.get(list.size() - 1).display();
    }
}
class Employee {
    int id;
    String name;
    String department;
    int salary;
    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}
