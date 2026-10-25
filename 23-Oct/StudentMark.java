package Oops;
public class StudentMark {
	public static void main(String[] args) {
		Studentm s = new Studentm();
        s.set_id(30);
        s.set_name("Madhu");
        s.set_mark(80);
        System.out.println("Student ID: " +s.get_id());
        System.out.println("Student Name: " +s.get_name());
        System.out.println("Marks: " +s.get_mark());
        s.set_mark(120);
	}
}
class Studentm{
	private int id;
	private int mark;
	private String name;
	public void set_id(int id){
		this.id=id;
	}
	public void set_mark(int mark){
		if(mark>=0 && mark<=100){
			this.mark=mark;
		}
		else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
        }
	}
	public void set_name(String name){
		this.name=name;
	}
	public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public int get_mark() {
        return mark;
    }
}