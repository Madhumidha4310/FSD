package Exception;

public class Throw {

	public void validate(int age){
		if(age<18){
			throw new ArithmeticException("Not Valid");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String[] args) {
		Throw a= new Throw();
		a.validate(25);
		System.out.println("Reset of the code");
	}
}