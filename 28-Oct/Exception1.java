package Exception;

public class Exception1 {

	public static void main(String[] args) {
		try{
			int a=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException Handled ");
		}
		try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException Handled");
        }

        try {
            int n = Integer.parseInt("abc");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }

        try {
            int arr[] = new int[5];
            arr[10] = 50;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }

        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }

        System.out.println("Reset of the code");
	}
}
