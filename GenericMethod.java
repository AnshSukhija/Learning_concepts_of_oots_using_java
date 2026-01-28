package Day14;

public class GenericMethod {
	public static <T> void display(T data) {
		System.out.println("Data : "+data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(100);
		display("hello");
		display(3.14);
		
	}

}
