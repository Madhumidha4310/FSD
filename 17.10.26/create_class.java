package Fundamentals;
import java.util.Scanner;
public class create_class {
	public static void main(String[] args) {
		FacePrep f1234=new FacePrep();
		f1234.sub();
	}
}
class FacePrep{
	int emp_count=550;
	String location="Coimbatore";
	public void addition(){
		System.out.println(emp_count+100);
	}
	public void sub(){
		System.out.println(emp_count-100);
	}
	public void multi(){
		System.out.println(emp_count*100);
	}
	public void div(){
		System.out.println(emp_count/100);
	}
}
class KamaRaj{
	int emp_count=1000;
	String location="Thoothukudi";
	public void addition(){
		System.out.println(emp_count+100);
	}
	public void sub(){
		System.out.println(emp_count-100);
	}
	public void multi(){
		System.out.println(emp_count*100);
	}
	public void div(){
		System.out.println(emp_count/100);
	}
}
