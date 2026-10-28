package Oops;
import org.apache.commons.lang3.ArrayUtils;
public class str {

	public static void main(String[] args)
	{
		String s="Face";
		String f="Face";
		s.concat("prep"); //pool, Immutable
		System.out.println(s);
		System.out.println(f.equals(s));
		
		StringBuffer sb=new StringBuffer("FACE"); //Heap memory, Buffullo
		sb.append("Prep");
		System.out.println(sb);
		System.out.println(f.equals(sb));
		
		StringBuilder sb2=new StringBuilder("Face");  ///Heap memory, Horse
		System.out.println(f.equals(sb2));  //checks the reference only like a 1001
	}
}
