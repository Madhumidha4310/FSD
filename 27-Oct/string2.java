package Strings;

public class string2 {

	public static void main(String[] args)
	{
		//Replace
		String s="Java is a programming language. Java is a platform. Java is an Object oriented and simple language";    
		String replaceString=s.replace("Java","Python");//replaces all the word "Java" is change into "Python"   
		System.out.println(replaceString);    
		
		//add string
		String m="Madhu"+"midha";  
		System.out.println(m);
		
		//concatation
		String s1="Madhu ";  
		String s2="Midha";  
		String s3=s1.concat(s2);  
		System.out.println(s3);
		
		//Equals()
	    String b1="Sachin";  
		String b2=new String("Sachin");  
	    String b3="Saurav";  
		   
		System.out.println(b1.equals(b2));
	    System.out.println(b1.equals(b3)); 

		//Equal Operator(==)
	    System.out.println(b1==b2); 
	    System.out.println(b1==b3);
		
		//compare the value 
		String c1="Sachin";  
		String c2="Sachin";  
		String c3="Ratan";  
		System.out.println(c1.compareTo(c2));//0  It is same
		System.out.println(c1.compareTo(c3));//1(because s1>s3)  
		System.out.println(c3.compareTo(c1));//-1(because s3 < s1 )  
		
		//Split()
	    String[] words=s.split("\\s");
	    for(String w:words){  
	    	System.out.println(w);  
	    }  

	    //Splitting 2
	    System.out.println("returning words:");  
	    for(String w:s.split("\\s",0)){  
	    System.out.println(w);  
	    }  
	    System.out.println("returning words:");  
	    for(String w:s.split("\\s",1)){  
	    System.out.println(w);  
	    }  
	    System.out.println("returning words:");  
	    for(String w:s.split("\\s",2)){  
	    System.out.println(w);
	    }
	}
}
