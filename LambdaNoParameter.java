package Day5;
interface Greeting{
	void SayHello();
}
public class LambdaNoParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greeting = () -> {
			System.out.println("Hello! welcome to Lambda Expression Example.");		
			};
			greeting.SayHello();
	}
}
