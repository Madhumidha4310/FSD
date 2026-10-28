package Strings;

public class String1 {

	public static void main(String[] args)
	{
		char ch[]={'s','t','r','i','n','g','s'};
		String s12=new String(ch);//converting char array to string
		String s3=new String("example");//creating java string by new keyword
		System.out.println(s12);
		System.out.println(s3); 
		
		String s="Sachin";  
		System.out.println("UpperCase: " +s.toUpperCase()); 	//Uppercase
		System.out.println("LowerCase: " +s.toLowerCase());     //Lowercase
		System.out.println(s); 
		
		//trim
		String a="   Sachin Tendulkar .";
		System.out.println(a); 
		System.out.println(a.trim());  //Remove extra gap
		System.out.println("The String start with Sa : " +s.startsWith("Sa"));
		System.out.println("The String ends with N : " + s.endsWith("N"));

		System.out.println("The 0th String is : "+s.charAt(0));
		System.out.println("The 3rd String is : "+s.charAt(3));
		System.out.println("Length of the string "+s.length());
		String s1=new String("SACHIN");  
		String s2=s1.intern();  // Add the pool(value) and reference
		System.out.println(s2);
		
		int x=10;  
		String b=String.valueOf(x);  //number change into string
		System.out.println(b+10);  

	}
}
