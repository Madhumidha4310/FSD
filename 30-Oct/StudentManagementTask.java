package Collections;
import java.util.*;
public class StudentManagementTask {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Student s1=new Student(101, "Arun", "CSE", 85);
        Student s2=new Student(102, "Kumar", "IT", 90);
        Student s3=new Student(103, "Priya", "ECE", 78);
        Student s4=new Student(104, "Divya", "CSE", 95);
        Student s5=new Student(105, "Ramesh", "IT", 88);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        set.add(s1.id);
        set.add(s2.id);
        set.add(s3.id);
        set.add(s4.id);
        set.add(s5.id);
        System.out.println("Student Details:");

        for (Student s : list) {
            s.display();
        }

        int searchId=102;
        for (Student s : list) {
            if (s.id == searchId) {
                System.out.println("Student Found:");
                s.display();
            }
        }

        int removeId = 103;

        Iterator<Student> itr=list.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.id == removeId) {
                itr.remove();
                set.remove(removeId);
                System.out.println("Student Removed: " + removeId);
            }
        }

        Student topper=list.get(0);
        for (Student s : list) {
            if (s.marks > topper.marks) {
                topper=s;
            }
        }
        System.out.println("\nTopper Details:");
        topper.display();
    }
}
class Student {
    int id;
    String name;
    String department;
    int marks;
    Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Marks : " + marks);
        System.out.println();
    }
}
