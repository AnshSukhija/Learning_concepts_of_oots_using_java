package Day7;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=10;
		int b=0;
		int r=a/b;
		System.out.println("Result:"+r);
		}
		catch (ArithmeticException e) {
			System.out.println("Error division by zero is not allowed");
			System.out.println("Exception:"+e.getMessage());
			
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("After try");
		
	}

}
