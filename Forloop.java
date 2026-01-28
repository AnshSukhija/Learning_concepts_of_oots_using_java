package Day2;
import java.util.*;
public class Forloop {
	public void Factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;	
		}
		System.out.println("Factorial of "+n+" is:"+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number here:");
		int n=sc.nextInt();
		Forloop gc = new  Forloop();
		gc.Factorial(n);
		sc.close();
	}


}
