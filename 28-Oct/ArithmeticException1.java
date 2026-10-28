package Exception;

public class ArithmeticException1 {

	public static void main(String[] args) {
		try{
			long data=100/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}
