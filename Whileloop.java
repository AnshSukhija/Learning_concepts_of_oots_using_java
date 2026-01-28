package Day2;

import java.util.Scanner;

public class Whileloop {
	public void  Fibonacci(int n) {
		int i=1;
		int a=1;
		int s=0;
		while(i<=n) {
			System.out.print(s+" ");
			int temp =s+a;
			s=a;
			a=temp;
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number here:");
		int n=sc.nextInt();
		Whileloop gc= new  Whileloop();
		gc.Fibonacci(n);
		sc.close();
	}

}
