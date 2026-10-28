package Strings;

public class strbufferandstrbuilder {

	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Face");
		for(int i=0;i<10000000;i++)
		{
			sb.append("prep");
		}
		System.out.println("Time taken by stringBuffer: "+ 
		(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Face");
		for(int i=0;i<10000000;i++)
		{
			sb1.append("prep");
		}
		System.out.println("Time taken by stringBuilder: "+ 
		(System.currentTimeMillis() - startTime)+"ms");
	}
}
